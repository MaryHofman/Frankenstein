package com.example.products.ApplicationLayer.DTO.in;

import java.util.List;
import java.util.Map;

public class CreateCategoryRequest {

    private String name;
    private String url;
    private byte[] image;
    private Map<String, List<String>> characteristicsType;

    
    public CreateCategoryRequest() {
    }

    
    public CreateCategoryRequest(String name, String url, byte[] image,  Map<String, List<String>> characteristicsType ) {
        this.name = name;
        this.url = url;
        this.image = image;
        this.characteristicsType = characteristicsType;
    }

    


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public byte[] getImage() {
        return image;
    }
    public void setImage(byte[] image) {
        this.image = image;
    }


    public Map<String, List<String>> getCharacteristicsType() {
        return characteristicsType;
    }


    public void setCharacteristicsType(Map<String, List<String>> characteristicsType) {
        this.characteristicsType = characteristicsType;
    }

    

}