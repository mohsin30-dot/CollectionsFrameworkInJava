import java.util.*;
public class LinkedListDemo{
    public static void main(String[] args){

        LinkedList<String> linkedlist = new LinkedList<String>();

        //Adding elements to the Linked list
        linkedlist.add("Iran");
        linkedlist.add("Iraq");
        linkedlist.add("India");
        linkedlist.add("Ireland");
        linkedlist.add("Italy");
        linkedlist.add("Israel");

        //Removing Fourth element
        //Same as list.remove(4);
        linkedlist.remove(4);

        System.out.print("\nAfter removing fourth element: ");
        //Iterating LinkedList again
        Iterator<String> iterator2 = linkedlist.iterator();
        while(iterator2.hasNext()){
            System.out.print(iterator2.next()+" ");
        }

        // Add Element
        linkedlist.add("between 3rd element and the 4th element");
        linkedlist.addLast("Last Item");
        System.out.println("LinkedList Content after addition: " +linkedlist);

    }

}