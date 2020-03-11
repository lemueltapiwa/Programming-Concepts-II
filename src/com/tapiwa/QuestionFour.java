package com.tapiwa;

public class QuestionFour {

    public static void main(String[] args) {

        for (int number = 1; number <= 1000; number++) {
            //Getting all numbers divisble by 10
            if (number % 10 == 0) {
                System.out.printf("%d ", number);
            }
        }
    }

}
