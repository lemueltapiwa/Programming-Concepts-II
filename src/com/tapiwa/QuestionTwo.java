package com.tapiwa;

public class QuestionTwo {

    public static void main(String args[])
    {
        double speed = 0.00;
        double time = 0.00;
        double distance = 0.00;

        //Speed(km / hr) 180km/hr
        speed = 180.00;

        //Time (hr) 3hrs 30min
        time = 3.50;
        distance = speed * time;

        System.out.println("\n The calculated Distance(km) : " + distance );

    }
}
