package com.example.myservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Cat {
    private String name;
    private HashMap<String,String> storage;

    public Cat(String name, HashMap<String, String> storage) {
        this.name = name;
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, String> getStorage() {
        return storage;
    }

    public void setStorage(HashMap<String, String> storage) {
        this.storage = storage;
    }

    public static HashSet<String> getDistinctCities(ArrayList<Cat> cats){
        HashSet<String> distinctCities = new HashSet<String>();
        for (Cat cat : cats
        ) {
            distinctCities.add(String.valueOf(cat.getStorage().keySet()));
        }
        return distinctCities;
    }
}
