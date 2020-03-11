package com.tapiwa;

//util package used for obtaining the input of the primitive types like int, double, etc. and strings.
//The Scanner class is used to get user input, and it is found in the java.util package

import java.util.Scanner;

public class QuestionThree {

    public static void main(String args[]) {
        int mark = 0;
        int passmark = 50;

        System.out.println("\n Please enter mark: ");
        Scanner input = new Scanner(System.in);

        while ((mark = input.nextInt()) != 0) {
            if (mark >= passmark) {
                System.out.println("you have passed");
                System.out.println("Input mark again");
                System.out.println("\n Enter 0 to exit: ");
            } else if(mark < passmark) {
                System.out.println("you have failed");
                System.out.println("Input mark again");
                System.out.println("\n Enter 0 to exit: ");
            }
        }

        System.out.println("End...!");
    }
}
