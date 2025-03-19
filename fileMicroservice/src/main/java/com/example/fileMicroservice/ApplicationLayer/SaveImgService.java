package com.example.fileMicroservice.ApplicationLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties.Io;
import org.springframework.cache.CacheManager;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferFactory;
import org.springframework.core.io.buffer.DefaultDataBufferFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.UUID;
import javax.imageio.ImageIO;
import com.example.fileMicroservice.ApplicationLayer.DTO.ImageDTO;
import reactor.core.publisher.Mono;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import org.springframework.cache.Cache;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@Service
public class SaveImgService {

    @Autowired
    private CacheManager cacheManager;

    public static BufferedImage takeImage(byte[] byteIMG) throws IOException {
        try (InputStream imageStream = new ByteArrayInputStream(byteIMG)) {
            BufferedImage image = ImageIO.read(imageStream);
            
            if (image == null) {
                throw new IOException("Не удалось декодировать изображение. Возможно, неподдерживаемый формат.");
            }
            
            return image;
        }
    }
    


    public String saveImage(byte[] image, String folder, String format, int width, int height) {
            // Создаем папку, если она не существует
            File directory = new File(folder);
            if (!directory.exists()) {
                boolean created = directory.mkdirs();
                if (!created) {
                    try {
                        throw new IOException("Не удалось создать папку: " + folder);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            // Генерация уникального имени файла
            String uniqueFileName = UUID.randomUUID().toString();
            String result;

            if (uniqueFileName.length() >= 100) {
                result = uniqueFileName.substring(0, 100);
            } else {
                result = uniqueFileName;
            }

            File imageFile = Paths.get(folder, uniqueFileName + "." + format).toFile();

            try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(image)) {
                // Чтение исходного изображения
                BufferedImage originalImage = ImageIO.read(byteArrayInputStream);
                if (originalImage == null) {
                    throw new IOException("Неверный формат изображения или поврежденный файл.");
                }

                // Масштабируем изображение до нужных размеров
                BufferedImage resizedImage = resizeImage(originalImage, width, height);

                // Сохраняем уменьшенное изображение
                boolean saved = ImageIO.write(resizedImage, format, imageFile);
                if (!saved) {
                    throw new IOException("Не удалось сохранить изображение. Убедитесь, что формат поддерживается: " + format);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            uniqueFileName = result + "." + format;
            return folder + "/" + uniqueFileName;
        }


    private BufferedImage resizeImage(BufferedImage originalImage, int width, int height) {
        // Создаем новое изображение с требуемыми размерами
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = resizedImage.createGraphics();

        // Устанавливаем параметры масштабирования для лучшего качества
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
        g.drawImage(originalImage, 0, 0, width, height, null);
        g.dispose();  // Освобождаем ресурсы графики

        return resizedImage;
    }
 

    public Mono<DataBuffer> takeImage(String folder, String name) {
                String cacheKey = folder + "/" + name;
                Cache cache = cacheManager.getCache("imageCache");
                
                if (cache != null && cache.get(cacheKey) != null) {
                    byte[] cachedImage = (byte[]) cache.get(cacheKey).get();
                    DataBufferFactory dataBufferFactory = new DefaultDataBufferFactory();
                    return Mono.just(dataBufferFactory.wrap(cachedImage));
                }

                Path imagePath = Paths.get(folder, name);
                
                if (Files.exists(imagePath)) {
                    DataBufferFactory dataBufferFactory = new DefaultDataBufferFactory();
                    
                    return Mono.fromCallable(() -> {
                        try {
                            byte[] bytes = Files.readAllBytes(imagePath);
                            DataBuffer buffer = dataBufferFactory.wrap(bytes);
                            if (cache != null) {
                                cache.put(cacheKey, bytes); 
                            }
                            
                            return buffer;
                        } catch (IOException e) {
                            throw new RuntimeException("Failed to read image", e);
                        }
                    });
                } else {
                    return Mono.empty(); 
                }
            }
        

        public String deleteImage(String url){
            File deletingFile = new File(url);

            if(deletingFile.exists()){
                deletingFile.delete();
                return "Файл удален";
            }
            else{
            return "Файл не удален";}
        }

    
 
    
}

