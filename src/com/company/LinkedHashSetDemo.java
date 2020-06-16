package com.company;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> lh = new LinkedHashSet<>();
        String[] st= new String[]{"1st", "2nd", "3rd", "4th", "5th", "6th"};

        lh.addAll(Arrays.asList(st));
        System.out.println("Initial set; "+lh);

        lh.remove("4th");
        System.out.println("Set after removing 4th element: " +lh );

        System.out.println("The element is available in the set: "+ lh.contains("abc"));

        lh.remove("5th");
        lh.remove("6th");

        String[] newSt = new String[]{"new 4th", "5th", "6th"};
        lh.addAll(Arrays.asList(newSt));

        System.out.println("Final set:"+ lh);

    }
}
