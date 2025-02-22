package com.example.fileMicroservice.ApplicationLayer.DTO;

import java.util.List;

public class ImageDTO {

    private byte[] mainPhoto;
    private List<byte[]> listPhoto;


    
    public ImageDTO(byte[] mainPhoto, List<byte[]> listPhoto) {
        this.mainPhoto = mainPhoto;
        this.listPhoto = listPhoto;
    }

    
    public byte[] getMainPhoto() {
        return mainPhoto;
    }
    public void setMainPhoto(byte[] mainPhoto) {
        this.mainPhoto = mainPhoto;
    }
    public List<byte[]> getListPhoto() {
        return listPhoto;
    }
    public void setListPhoto(List<byte[]> listPhoto) {
        this.listPhoto = listPhoto;
    }

    
}
