package com.example.products.ApplicationLayer.DTO.out;

import java.util.List;
import java.util.Map;

public class CreateCategoryResponse {
    private Long id;
    private String name;
    private String url;
    private String imageURL;
    private Map<String, List<String>> characteristicsType;

    
    public CreateCategoryResponse() {
    }

    
    public CreateCategoryResponse(Long id, String name, String url, String imageURL, Map<String, List<String>> characteristicsType) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.imageURL = imageURL;
        this.characteristicsType = characteristicsType;
    }

    

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getImageURL() {
        return imageURL;
    }


    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
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


    public Map<String, List<String>> getCharacteristicsType() {
        return characteristicsType;
    }


    public void setCharacteristicsType(Map<String, List<String>> characteristicsType) {
        this.characteristicsType = characteristicsType;
    }
    
    
   

}