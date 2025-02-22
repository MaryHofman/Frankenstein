package com.example.getaway.Products.Application.DTO.in;

import java.util.List;
import java.util.Map;

public class CharacteristicsDTO {
    private Map<String, List<String>> characteristicsType;


    public CharacteristicsDTO() {
    }

    public Map<String, List<String>> getCharacteristicsType() {
        return characteristicsType;
    }

    public void setCharacteristicsType(Map<String, List<String>> characteristicsType) {
        this.characteristicsType = characteristicsType;
    }

    
   
}

