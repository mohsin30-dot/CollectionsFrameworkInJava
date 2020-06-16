package com.company;

import java.util.ArrayList;
public class ArrayListDemo {

    public static void main(String[] args) {
        //we can only add string element
        ArrayList<String> obj = new ArrayList<String>();// creating an empty integer Arraylist

        // add element in Arraylist
        obj.add("Iran");
        obj.add("Iraq");
        obj.add("India");
        obj.add("Ireland");
        obj.add("Italy");
        obj.add("Israel");

        // Displaying elements
        System.out.print("ArrayList is :" + obj);

       /* for(String str:obj)
            System.out.println(str); // multiple way we can get result */

        obj.remove("Italy"); // remove 4th element from arraylist(HW ReQ)
        System.out.println("after remove 4th element Arraylist is :" + obj);

       // Search for a particular element
        boolean status = obj.contains("India");
        if(status){
            System.out.println("Array list contains this element");
        }
        else{
            System.out.println("Array list does NOT contain this element");
        }
        // Insert a new element in index
        obj.add(4, "Indonesia");
        obj.add(5, "Iceland");
        System.out.println("ArrayList after add element:" + obj);
    }



}
