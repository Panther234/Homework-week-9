package homework_week_9;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given array list
 */
public class Question6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Blue");//index 0
        list.add("Black");//index 1
        list.add("Red");//index 2
        list.add("White");//index 3
        list.add("Pink");//index 4
        //retrieve an element (at a specified index) using get method
        System.out.println("The element at index 2 is: " + list.get(2));
    }

}
