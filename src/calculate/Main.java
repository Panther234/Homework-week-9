package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            if (count == 0) {
                System.out.print("Enter first Number: ");
                int firstNumber = sc.nextInt();
                System.out.print("Enter second Number: ");
                int secondNumber = sc.nextInt();
                System.out.print("Please enter one of symbol +,-,*,/: ");
                String operationStr = sc.next();
                if (operationStr.length() == 1) {
                    char operation = operationStr.charAt(0);
                    Calculator c = new Calculator();
                    c.calculateResult(firstNumber, secondNumber, operation);
                }
                System.out.print("Would you like to do more calculation Please enter Y or N: ");
                count++;
            } else {
                String yesOrNo = sc.next();
                switch (yesOrNo) {
                    case "Y":
                    case "y":
                        System.out.print("Enter first Number: ");
                        int firstNumber = sc.nextInt();
                        System.out.print("Enter second Number: ");
                        int secondNumber = sc.nextInt();
                        System.out.print("Please enter one of symbol +,-,*,/: ");
                        String operationStr = sc.next();
                        if (operationStr.length() == 1) {
                            char operation = operationStr.charAt(0);
                            Calculator c = new Calculator();
                            c.calculateResult(firstNumber, secondNumber, operation);
                        }
                        System.out.print("Would you like to do more calculation Please enter Y or N: ");
                        break;
                    case "N":
                    case "n":
                        sc.close();
                        return;
                }

            }
        }
    }

}
