package com.example.products.ApplicationLayer.Services;


import io.grpc.StatusRuntimeException;

import com.example.shared.ConfirmationOfAvailabilityGrpc;
import com.example.shared.gRPCserviceGrpc;
import com.example.shared.ConfirmationOfAvailabilityGrpc.ConfirmationOfAvailabilityBlockingStub;
import com.example.shared.Service.DeleteListImagesRequest;
import com.example.shared.Service.DeleteListImagesResponse;
import com.example.shared.Service.DeleteOneImageRequest;
import com.example.shared.Service.DeleteOneImageResponse;
import com.example.shared.Service.ProductDeletedRequest;
import com.example.shared.Service.ProductDeletedResponse;
import com.example.shared.Service.SaveListImageRequest;
import com.example.shared.Service.SaveListImageResponse;
import com.example.shared.Service.SaveOneImageRequest;
import com.example.shared.Service.SaveOneImageResponse;
import com.google.protobuf.ByteString;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ImageService {

    @Autowired
    private  gRPCserviceGrpc.gRPCserviceBlockingStub blockingStub;

    @Autowired
    private ConfirmationOfAvailabilityGrpc.ConfirmationOfAvailabilityBlockingStub stub;
  

    public String sendOneImage(byte[] mainPhoto, String folder) throws IOException {
        SaveOneImageRequest request = SaveOneImageRequest.newBuilder()
            .setPhoto(ByteString.copyFrom(mainPhoto)) 
            .setFolder(folder)
            .build();

        try {
            SaveOneImageResponse response = blockingStub.saveOneImage(request);
            return response.getResultMessage();
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
            throw new RuntimeException("gRPC request failed: " + e.getMessage());
        }
    }

    public List<String> sendListImages(List<byte[]> photos, String folder) throws IOException {
        SaveListImageRequest request = SaveListImageRequest.newBuilder()
            .addAllMainPhoto(photos.stream().map(e->ByteString.copyFrom(e)).collect(Collectors.toList()))
            .setFolder(folder)
            .build();

        try {
            SaveListImageResponse response = blockingStub.saveListImages(request);
            return response.getResultMessageList();
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
            throw new RuntimeException("gRPC request failed: " + e.getMessage());
        }
    }


    public boolean markAsUnavailable(Long productsId){
        ProductDeletedRequest request = ProductDeletedRequest.newBuilder()
        .setProductId(productsId)
        .build();

        ProductDeletedResponse response = stub.markProductAsUnavailable(request);


        return response.getSuccess();

    }

    public String deleteOneImage(String urlImage){
        DeleteOneImageRequest request = DeleteOneImageRequest.newBuilder()
        .setUrlPhoto(urlImage)
        .build();

        DeleteOneImageResponse response = blockingStub.deleteOneImage(request);

        return response.getResult();
    }

    public String deleteListImages(List<String> urlsImages){
        DeleteListImagesRequest request = DeleteListImagesRequest.newBuilder()
        .addAllUrlPhoto(urlsImages)
        .build();

        DeleteListImagesResponse response = blockingStub.deleteListImages(request);

        return response.getResult();
    }

}




