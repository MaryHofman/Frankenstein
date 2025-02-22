package com.example.fileMicroservice.ApplicationLayer;

import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties.Io;
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

import java.awt.image.BufferedImage;


import org.springframework.stereotype.Service;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.UUID;

@Service
public class SaveImgService {

   

    public static BufferedImage takeImage(byte[] byteIMG) throws IOException {
        try (InputStream imageStream = new ByteArrayInputStream(byteIMG)) {
            BufferedImage image = ImageIO.read(imageStream);
            
            if (image == null) {
                throw new IOException("Не удалось декодировать изображение. Возможно, неподдерживаемый формат.");
            }
            
            return image;
        }
    }
    


    public String saveImage(byte[] image, String folder, String format){
      
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

        String uniqueFileName = UUID.randomUUID().toString();

        String result;

        if (uniqueFileName.length() >= 100) {
             result = uniqueFileName.substring(0, 100);
        } else {
             result = uniqueFileName; 
        }


        File imageFile = Paths.get(folder, uniqueFileName + "." + format).toFile();

        try(ByteArrayInputStream write = new ByteArrayInputStream(image)){
            BufferedImage buffImage = ImageIO.read(write);
            if (buffImage == null) {
                throw new IOException("Неверный формат изображения или поврежденный файл.");
            }
    
       
            boolean saved = ImageIO.write(buffImage, format, imageFile);
            if (!saved) {
                throw new IOException("Не удалось сохранить изображение. Убедитесь, что формат поддерживается: " + format);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    
        uniqueFileName = result+ "." + format; 
     
        return folder+"/"+uniqueFileName;
    }

 

        public Mono<byte[]> takeImage(String folder, String name) {
            return Mono.fromCallable(() -> {
                File imageFile = new File(folder, name);

                if (!imageFile.exists()) {
                    return null;
                }

                try (FileInputStream fileInputStream = new FileInputStream(imageFile);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {

                    byte[] buffer = new byte[4096];
                    int bytesRead;
                    while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                        byteArrayOutputStream.write(buffer, 0, bytesRead);
                    }

                    return byteArrayOutputStream.toByteArray();
                } catch (IOException e) {
                    throw new RuntimeException("Error reading file", e);
                }
            });
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

