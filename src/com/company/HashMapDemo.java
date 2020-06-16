package com.company;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(2, "Cat");
        hashMap.put(1, "Dog");
        hashMap.put(4, "Horse");
        hashMap.put(6, "Cow");
        hashMap.put(5,"Deer");
        hashMap.put(3, "Butterfly");

        System.out.println("Initial HashMap: "+hashMap);

        hashMap.remove(4);

        System.out.println("HashMap after removing 4th element: "+hashMap);

        System.out.println("The element is present in the HashMap. "+ hashMap.containsValue("Deer"));

        hashMap.put(4, "Human");

        System.out.println("Final hash map: "+ hashMap);


    }
}
