package com.tapiwa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class QuestionSix {
    public static void main(String[] args) {
        String team = "Team";
        String matchesplayed = "MP";
        String points = "Points";

        Scanner input = new Scanner(System.in);
        int rowsize = 10;
        int columnsize = 3;

        //Header
        String header[][] = {
                {team, matchesplayed, points}
        };

        //Body
        //Data in multidimensional arrays are stored in tabular form (in row major order).
        String leaguetable[][] = new String[rowsize][columnsize];

        System.out.println("Enter league data: ");
        for (int row = 0; row < rowsize; row++) {
            for (int col = 0; col < columnsize; col++) {
                leaguetable[rowsize][columnsize] = input.nextLine();
            }
        }


        for (String[] row : header) {
            System.out.println(Arrays.toString(row));


        }
        for (int row = 0; row < rowsize; row++) {
            for (int col = 0; col < columnsize; col++) {

                System.out.println(leaguetable[rowsize][columnsize] + "\t");

            }
            System.out.println();
            //Write to file
            writeUsingFiles(leaguetable.toString());

        }


    }

    /**
     * Use Files class from Java 1.7 to write files, internally uses OutputStream
     *
     * @param data
     */
    private static void writeUsingFiles(String data) {
        try {
            Files.write(Paths.get("/Users/tapiwa/Documents/League.txt"), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
