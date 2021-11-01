package homework_week_9;

import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme using if else and while loop.
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name       \t \t:\t");
        String name = scanner.next();
        System.out.print("Enter Student Roll Number  \t\t:\t");
        String roll = scanner.next();
        System.out.print("Enter Marks of Subject Maths\t:\t");
        int s1 = scanner.nextInt();
        while (!(0 <= s1 && s1 <= 100)) {
            System.out.println("Invalid input, Marks should between 0 to 100");
            System.out.print("Please enter correct marks\t\t:");
            s1 = scanner.nextInt();
        }
        System.out.print("Enter Marks of Subject Science\t:\t");
        int s2 = scanner.nextInt();
        while (!(0 <= s2 && s2 <= 100)) {
            System.out.println("Invalid input, Marks should between 0 to 100");
            System.out.print("Please enter correct marks\t\t:");
            s2 = scanner.nextInt();
        }
        System.out.print("Enter Marks of Subject English\t:\t");
        int s3 = scanner.nextInt();
        while (!(0 <= s3 && s3 <= 100)) {
            System.out.println("Invalid input, Marks should between 0 to 100");
            System.out.print("Please enter correct marks\t:\t");
            s3 = scanner.nextInt();
        }
        int total;
        float p;
        total = s1 + s2 + s3;
        p = total / 3;
        System.out.println("_______________________________");
        System.out.println("|                             |");
        System.out.println("|\t\t  Mark Sheet   \t\t|");
        System.out.println("|_____________________________|");
        System.out.println("|\tName     \t:\t" + name +"\t\t|");
        System.out.println("|\tRoll No  \t:\t" + roll +"\t\t|");
        System.out.println("|_____________________________|");
        System.out.println("|\tSubjects\t:\tMarks\t  |");
        System.out.println("|_____________________________|");
        System.out.println("|\tMaths   \t:\t" + s1 + "\t\t  |");
        System.out.println("|\tScience \t:\t" + s2 + "\t\t  |");
        System.out.println("|\tEnglish \t:\t" + s3 + "\t\t  |");
        System.out.println("|_____________________________|");
        System.out.println("|\tTotal   \t:\t" + total + "\t\t  |");
        System.out.println("|_____________________________|");
        System.out.println("|\tPercentage \t:\t" + p + "\t  |");

        if (p >= 35 && s1 >= 35 && s2 >= 35 && s3 >= 35) {
            System.out.println("|\tResult\t\t:\tPass      |");
        } else {
            System.out.println("|\tResult\t\t:\tFail      |");
        }
        if (p >= 80) {
            System.out.println("|\tGrade\t\t:\tA+        |");
            System.out.println("|_____________________________|");
        } else if (p >= 60) {
            System.out.println("|\tGrade\t\t:\tA         |");
            System.out.println("|_____________________________|");
        } else if (p >= 50) {
            System.out.println("|\tGrade\t\t:\tB         |");
            System.out.println("|_____________________________|");
        } else if (p >= 35) {
            System.out.println("|\tGrade\t\t:\tC         |");
            System.out.println("|_____________________________|");

        }
    }
}
