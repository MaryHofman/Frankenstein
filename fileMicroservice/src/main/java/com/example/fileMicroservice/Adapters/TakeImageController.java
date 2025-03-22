package com.example.fileMicroservice.Adapters;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.fileMicroservice.ApplicationLayer.SaveImgService;

import reactor.core.publisher.Mono;

@Controller
public class TakeImageController {
    @Autowired
    private SaveImgService saveImgService;

    @GetMapping("/{folder}/{name}")
    public Mono<ResponseEntity<? extends Object>> getImage(@PathVariable String folder, @PathVariable String name) {
        return saveImgService.takeImage(folder, name)
                .flatMap(image -> {
                    String contentType = "image/webp";
                    if (image != null) {
                        return Mono.just(ResponseEntity.ok()
                                .contentType(MediaType.valueOf(contentType))
                                .body(image));
                    } else {
                        return Mono.just(ResponseEntity.notFound().build());
                    }
                })
                .onErrorResume(e -> Mono.just(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build()));
    }

}
