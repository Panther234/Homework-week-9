package homework_week_9;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list,
 * add some colours (string) and printout the collection using for each loop.
 */
public class Question4 {
    public static void main(String[] args) {
        //Arraylist declaration
        ArrayList<String> colourist = new ArrayList<>();
        colourist.add("Blue");
        colourist.add("Black");
        colourist.add("Red");
        colourist.add("White");
        colourist.add("Pink");

        for (String data : colourist) {
            System.out.println(data);

        }
    }
}
