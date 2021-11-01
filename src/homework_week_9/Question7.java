package homework_week_9;

import java.util.ArrayList;

/**
 * Write a Java program to test an array list is empty or not.
 * Define array list with underground tube names
 */
public class Question7 {

    public static void main(String[] args) {

        ArrayList<String> tubeList = new ArrayList<String>();
        tubeList.add("Piccadily line");
        tubeList.add("Bakerloo line");
        tubeList.add("Central line");
        tubeList.add("Circle line");
        tubeList.add("District line");
        tubeList.add("Jubilee line");

        boolean ans = tubeList.isEmpty();
        if (ans == true){
            System.out.println("The arraylist is empty");
        } else{
            System.out.println("The arraylist is not empty");
        }

    }
}
