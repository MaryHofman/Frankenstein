package com.example.fileMicroservice.ApplicationLayer;

import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

import com.example.fileMicroservice.ApplicationLayer.DTO.ImageDTO;
import com.example.shared.*;
import com.example.shared.Service.DeleteListImagesRequest;
import com.example.shared.Service.DeleteListImagesResponse;
import com.example.shared.Service.DeleteOneImageRequest;
import com.example.shared.Service.DeleteOneImageResponse;
import com.example.shared.Service.SaveListImageRequest;
import com.example.shared.Service.SaveListImageResponse;
import com.example.shared.Service.SaveOneImageRequest;
import com.example.shared.Service.SaveOneImageResponse;

import java.util.stream.Collectors;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


    @Service
    public class gRPCserviceImpl extends gRPCserviceGrpc.gRPCserviceImplBase {
        
        @Autowired
        private SaveImgService saveImgService;

        @Override
        public void saveOneImage(SaveOneImageRequest request, StreamObserver<SaveOneImageResponse> responseObserver) {
            String folder = request.getFolder();
            byte[] photo = request.getPhoto().toByteArray();


            String resultMessage;
    
            resultMessage = saveImgService.saveImage(photo, folder, "webp");

            SaveOneImageResponse response = SaveOneImageResponse.newBuilder()
                .setResultMessage(resultMessage)
                .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();}


        @Override
        public void saveListImages(SaveListImageRequest request, StreamObserver<SaveListImageResponse> responseObserver) {
            String folder = request.getFolder();
            List<String> resultMessages = new ArrayList<>();

            for (byte[] photo : request.getMainPhotoList().stream().map(bytes -> bytes.toByteArray()).toList()) {
                resultMessages.add(saveImgService.saveImage(photo, folder, "webp"));
            }

            SaveListImageResponse response = SaveListImageResponse.newBuilder()
                    .addAllResultMessage(resultMessages)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void deleteOneImage(DeleteOneImageRequest request, StreamObserver<DeleteOneImageResponse> responseObserver) {
            String urlPhoto = request.getUrlPhoto();

            String result = saveImgService.deleteImage(urlPhoto);

            DeleteOneImageResponse response = DeleteOneImageResponse.newBuilder()
                    .setResult(result)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void deleteListImages(DeleteListImagesRequest request, StreamObserver<DeleteListImagesResponse> responseObserver) {

            List<String> urlPhotos = request.getUrlPhotoList();

            for (String urlPhoto : urlPhotos) {        
               saveImgService.deleteImage(urlPhoto);
            }

            String result = "Images deleted: " + urlPhotos.size();

            DeleteListImagesResponse response = DeleteListImagesResponse.newBuilder()
                    .setResult(result)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }



