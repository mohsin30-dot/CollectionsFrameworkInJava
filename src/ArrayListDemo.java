
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

        /* use contains() to check if the element India exist or not

        boolean ans = ArrayListDemo.contains("India");

        if (ans)
            System.out.println("The list contains India");
        else
            System.out.println("The list does not contains India");

        // use contains() to check if the element Ivory coast exist or not

        ans = ArrayListDemo.contains("Ivory coast");

        if (ans)
            System.out.println("The list contains Ivory coast");
        else
            System.out.println("The list does not contains Ivory coast"); */

        // Insert a new element in index
        obj.add(4, "Indonesia");
        obj.add(5, "Iceland");
        System.out.println("ArrayList after add element:" + obj);
    }

}
