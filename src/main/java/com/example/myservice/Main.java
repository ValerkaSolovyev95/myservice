package com.example.myservice;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
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

        Cat.getDistinctCities(catArrayList);
        System.out.println(Cat.getDistinctCities(catArrayList));
    }
}
