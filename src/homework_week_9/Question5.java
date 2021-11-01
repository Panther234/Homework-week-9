package homework_week_9;

import java.util.ArrayList;

/**
 * Write a Java program to iterate through all elements in an array list using Iterator.
 */
public class Question5 {
    public static void main(String[] args) {
        //Creating Array list
        ArrayList<String> colourist = new ArrayList<>();
        colourist.add("Blue");
        colourist.add("Black");
        colourist.add("Red");
        colourist.add("White");
        colourist.add("Pink");
        System.out.println("ArrayList: " + colourist);

        //using for loop (iterator)
        System.out.println("Iterating over ArrayList using for loop: ");
        for(int i = 0; i < colourist.size(); i++){
            System.out.print(colourist.get(i));
            System.out.print(", ");
        }

    }
}
