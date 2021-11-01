package homework_week_9;

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        int[] intArray = {0, 1, 2, 3, 4, 5, 6}; // Array to reverse
        int temp;
        int start = 0;
        int end = intArray.length - 1;
        while (start < end) {
            temp = intArray[start];
            intArray[start] = intArray[end];
            intArray[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(intArray));
    }
}
