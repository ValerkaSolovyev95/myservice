package com.example.myservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

@Service
public class ServiceCat {




    public static ArrayList<Cat> createCatList(){

        HashMap<String,String> vasyaAncestors = new HashMap<>();
        vasyaAncestors.put("Питер", "23.02.34");
        Cat vasya = new Cat("Vasya", vasyaAncestors);

        HashMap<String,String> petyaAncestors = new HashMap<>();
        petyaAncestors.put("Чита", "23.02.34");
        Cat petya = new Cat("Petya", petyaAncestors);

        HashMap<String,String> oliaAncestors = new HashMap<>();
        oliaAncestors.put("Москва", "23.02.34");
        Cat olia = new Cat("Olia", oliaAncestors);

        ArrayList<Cat> catArrayList = new ArrayList<>();

        catArrayList.add(petya);
        catArrayList.add(vasya);
        catArrayList.add(olia);

        return catArrayList;

    }




    public ArrayList<String> getDistinctCities(){
        ArrayList <Cat> cats = createCatList();
        HashSet<String> distinctCities = new HashSet<String>();
        ArrayList<String> cities = new ArrayList<>();
        for (Cat cat : cats
        ) {
            distinctCities.add(String.valueOf(cat.getStorage().keySet()));
        }
        for (String str: distinctCities
             ) {
            cities.add(str);
        }
        return cities;
    }


}
