package com.example.getaway.Products.Adapters.Convertors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class toCategoriesCharacteristics {

    public static Map<String, List<String>> convertToCategoriesCharacteristics(Map<String, String> stringCharacteristics){
        
        Map<String, List<String>> converted = new HashMap<>();

        for(Map.Entry<String, String> characteristic : stringCharacteristics.entrySet()){

            List<String> characteristics = Arrays.asList(characteristic.getValue().split(", "));
            converted.put(characteristic.getKey(), characteristics);

        }
        return converted;
    }
    
}
