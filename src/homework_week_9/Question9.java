package homework_week_9;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store
 * String keys and Integer values: And use for each loop to iterate the value from Map.
 */
public class Question9 {

    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();
        people.put("James", 44);
        people.put("Adam", 40 );
        people.put("Tom", 35 );
        people.put("Jerry", 30);

        for (Map.Entry<String, Integer> peopleEntry : people.entrySet()){
            System.out.println(peopleEntry.getKey()+ ", " + peopleEntry.getValue());
        }
          System.out.println(people.size());
    }

}
