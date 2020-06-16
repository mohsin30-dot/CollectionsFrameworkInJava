package com.company;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<Integer> hash = new HashSet<>();

        for(int i=1; i<=6; i++){
            hash.add(i);
        }

        System.out.println("Initial HashSet: "+ hash);

        hash.remove(4);
        System.out.println("HashSet after removing 4th element: "+ hash);

        boolean status= hash.contains(2);
        if(status){
            System.out.println("This element is available in the HashSet");
        }
        else{
            System.out.println("This element is NOT available in the HashSet");
        }

        for(int i=1; i<=3;i++){
            hash.remove(i);
        }

        System.out.println(hash);
        for(int i= 1; i<=4;i++){
            hash.add(i);
        }

        hash.add(44);

        System.out.println("Final HashSet: "+hash);


    }
}

