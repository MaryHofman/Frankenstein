package com.example.products.InfrastructureLayer.Entity;


import java.util.List;
import java.util.Map;

import com.example.products.InfrastructureLayer.Convertors.CharacteristicsTypeConverter;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false, unique = true)
    private String url;

    @Column(name = "image_url")
    private String imageURL;

    @Column(name = "characteristics_type", columnDefinition = "TEXT")
    @Convert(converter = CharacteristicsTypeConverter.class)
    private Map<String, List<String>> characteristicsType;

    public Category() {}

    public Category(Long id, String name, String url, String imageURL, Map<String, List<String>> characteristicsType) {
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

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }


    public Map<String, List<String>> getCharacteristicsType() {
        return characteristicsType;
    }

    public void setCharacteristicsType(Map<String, List<String>> characteristicsType) {
        this.characteristicsType = characteristicsType;
    }

     @Override
     public String toString() {
         return "Category{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 ", url='" + url + '\'' +
                 ", imageURL='" + imageURL + '\'' +
                 '}';
     }
}
