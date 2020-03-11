package com.tapiwa;

import java.util.Scanner;

public class QuestionFive {

    public static void main(String[] args) {

        int choice;
        int num1;
        int num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Input the first number: ");
        num1 = input.nextInt();
        System.out.println("Input the second number: ");
        num2 = input.nextInt();

        System.out.println("MENU");
        System.out.println("Addition: Press 1");
        System.out.println("Subtraction:Press 2");
        System.out.println("Product:Press 3");
        System.out.println("Exit 4");

        System.out.println("Enter menu choice: ");

        while ((choice = input.nextInt()) != 4) {
            if (choice == 1) {
                //sum operation
                int sum = num1 + num2;
                System.out.println("\n The sum is: " + sum);
            } else if (choice == 2) {
                //subtraction operation
                int minus = num1 - num2;
                System.out.println("\n The difference is: " + minus);
            } else if (choice == 3) {
                //product operation
                int multiply = num1 * num2;
                System.out.println("\n The product is: " + multiply);
            }

        }

        System.out.println("You pressed exit...!");
    }
}
