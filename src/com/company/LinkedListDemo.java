package com.company;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void LinkedListDemo(String[] args) {

        LinkedList<Integer> obj = new LinkedList<>();

        obj.add(2);
        obj.add(5);
        obj.add(1, 3);
        obj.add(2, 4);
        obj.addFirst(1);
        obj.addLast(6);

        System.out.println("Linked list: " + obj);

        obj.remove(3);
        System.out.println("Linked list after removing 4th element: " + obj);

        boolean status = obj.contains(1);

        if(status){
            System.out.println("Linked list contains this element");
        }
        else{
            System.out.println("Linked list does NOT contain this element");
        }

        obj.add(3, 4);
        System.out.println("The new Linked list: "+ obj);



    }
}