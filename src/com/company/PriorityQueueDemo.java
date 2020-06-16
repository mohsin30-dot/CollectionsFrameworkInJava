package com.company;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        String[] x = new String[]{"1st", "2nd", "3rd", "4th", "5th", "6th"};

        PriorityQueue<String> priorityQ= new PriorityQueue<>();

        priorityQ.addAll(Arrays.asList(x));
        System.out.println("Initial Elements: "+ priorityQ);

        priorityQ.remove("4th");
        System.out.println("Queue after removing 4th element: "+priorityQ);

        boolean status = priorityQ.contains("3rd");
        if(status){
            System.out.println("The element is available in the Queue");}
        else{
            System.out.println("The element is NOT available");
        }

        for(int i=0; i<6; i++){
            priorityQ.poll();
        }


        String[] y = new String[]{"1st", "2nd", "3rd", "New 4th", "5th", "6th"};
        priorityQ.addAll(Arrays.asList(y));


        System.out.println("New Queue: "+priorityQ);

    }
}

