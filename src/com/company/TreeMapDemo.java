package com.company;


import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap= new TreeMap<>();

        treeMap.put(2, "Monday");
        treeMap.put(1, "Sunday");
        treeMap.put(4, "Wednesday");
        treeMap.put(6, "Friday");
        treeMap.put(5,"Thursday");
        treeMap.put(3, "Tuesday");

        System.out.println("Initial TreeMap: "+treeMap);

        treeMap.remove(4);

        System.out.println("TreeMap after removing 4th element: "+treeMap);

        System.out.println("The element is present in the TreeMap. "+ treeMap.containsValue("Saturday"));

        treeMap.put(4, "Saturday");

        System.out.println("Final TreeMap: "+ treeMap);


    }
}

