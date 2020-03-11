package com.tapiwa;

public class QuestionOne {

    //The main() function is the starting point for JVM to start execution of a Java program.
    public static void main(String args[]) //static method
    {
        //Variable declaration
        String myName = "Tapiwa Chawa";
        char gender = 'M';
        int yearofstudy = 2;
        boolean fulltime = true;
        int programme;
        String courseone = "Programming Concepts I";
        String coursetwo = "Programming Concepts II";

        //A bit is derived from the phrase "binary digit," represented by 0 or 1.
        //The 0 basically means off/false and 1 means on/true.
        programme = 1;


        System.out.println("Printing variables...");
        System.out.println("My Name:" + myName);
        System.out.println("Gender:" + gender);
        System.out.println("Year Of Study:" + yearofstudy);
        System.out.println("Full Time:" + fulltime);
        System.out.println("Programme:" + programme);
        System.out.println("Course One:" + courseone);
        System.out.println("Course Two:" + coursetwo);
    }

}
