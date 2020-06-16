package com.company;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("A");
        treeSet.add("F");
        treeSet.add("B");
        treeSet.add("E");
        treeSet.add("D");
        treeSet.add("C");

        System.out.println("Initial TreeSet: "+ treeSet);

        treeSet.remove("D");
        System.out.println("TreeSet after removing 4th Element: "+ treeSet);

        System.out.println("This element is available in the list. "+ treeSet.contains("F"));

        treeSet.add("D_new");

        System.out.println("Final treeSet: "+ treeSet);

    }
}

