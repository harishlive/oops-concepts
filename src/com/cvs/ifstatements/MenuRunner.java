package com.cvs.ifstatements;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Number1: ");
        int number1 = scanner.nextInt();
        System.out.print("The number you enter is :" +number1);

        System.out.print("Enter Number2: ");
        int number2 = scanner.nextInt();
        System.out.println("Choices available :");
        System.out.println("1 -add");
        System.out.println("2 -sub");
        System.out.println("3 -muliply");
        System.out.println("4 -divide");

        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();

        System.out.println("Your choices are");
        System.out.println("number1: " +number1);

        System.out.println("number2: " +number2);

        System.out.println("choice: " +choice);

        performOperationUsingSwitch(number1, number2, choice);

    }

    private static void performOperationUsingSwitch(int number1, int number2, int choice) {
        switch (choice) {
            case 1:
                System.out.println("Result: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result: " + (number1 * number2));
                break;
            case 4:
                System.out.println("Result: " + (number1 / number2));
                break;
            case 5:
                System.out.println("Invalid Operation");

        }
    }
}
