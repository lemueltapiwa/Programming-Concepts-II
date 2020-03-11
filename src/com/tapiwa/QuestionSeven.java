package com.tapiwa;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionSeven {
    //Pupil information
    private int idNumber;
    private String FirstName;
    private String Surname;
    private char Gender;
    private int Grade = 1;
    private String NextOfKeen;
    private int NextOfKeenPhone;

    public QuestionSeven(int idNumber, String FirstName, String Surname, char Gender, int Grade, String NextOfKeen, int NextOfKeenPhone) {
        idNumber = idNumber;
        FirstName = FirstName;
        Surname = Surname;
        Gender = Gender;
        Grade = Grade;
        NextOfKeen = NextOfKeen;
        NextOfKeenPhone = NextOfKeenPhone;
    }


    public int getIdNumber() {
        return idNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getSurname() {
        return Surname;
    }

    public char getGender() {
        return Gender;
    }

    public int getGrade() {
        return Grade;
    }

    public String getNextOfKeen() {
        return NextOfKeen;
    }

    public int getNextOfKeenPhone() {
        return NextOfKeenPhone;
    }

    public String toString() {
        return "idNumber: " + idNumber + "FirstName: " + FirstName + ", Surname: " + Surname +
                ", Gender: " + Gender + ", Grade: " + Grade +
                ", Next Of Keen: " + NextOfKeen + ", Next Of PhoneNo.: " + NextOfKeenPhone;
    }

    public static void main(String[] args) {
        int count = 0;
        int menuChoice = -1;
        QuestionSeven[] pupils = new QuestionSeven[5];
        Scanner input = new Scanner(System.in);


        do {
            System.out.println("\t\t\tPupil Record Menu");
            System.out.println("\t\t1. Add Pupil\t2. View Pupil\t3. Search Pupil\t4. Exit");
            System.out.println("Enter a choice: ");
            menuChoice = input.nextInt();

            if (menuChoice==1){
                if(count < 5) {
                    System.out.println("ID Number:");
                    int id = input.nextInt();
                    System.out.println("First Name:");
                    String fname = input.next();
                    System.out.println("SurName:");
                    String sname = input.next();
                    System.out.println("Gender:");
                    char gender = input.next().charAt(0);
                    System.out.println("Grade:");
                    int grade = input.nextInt();
                    System.out.println("Next Of Keen:");
                    String nok = input.next();
                    System.out.println("Next Of PhoneNo.:");
                    int nokp = input.nextInt();

                    //Create the new pupil using the given inputs
                    QuestionSeven pupil = new QuestionSeven(id, fname, sname, gender, grade,nok, nokp);

                    //Place in array
                    pupils[count] = pupil;

                    //Increment count for next pupil placement
                    count++;
                }
                else {  //Not able to add new student
                    System.out.println("Can't add new pupil, pupils full");
                }
            }
            else if (menuChoice==2) {
                for (int i=0; i<count; i++) {
                    QuestionSeven pupil = pupils[i];
                    System.out.println(pupil.getIdNumber() + pupil.getFirstName() + pupil.getSurname() + pupil.getGender()
                            + pupil.getGrade() + pupil.getNextOfKeen() + pupil.getNextOfKeenPhone());
                }
            }
            else if (menuChoice==3) {
                System.out.println("Enter first name to search");
                Scanner in=new Scanner(System.in);
                String searchTerm = in.nextLine();

                QuestionSeven pupil = pupils[count];
                if(searchTerm == pupil.getFirstName()){
                    System.out.println("Result found: "+pupil.getFirstName() + "" + pupil.getSurname());
                }
                else {
                    System.out.println("No records found");
                }
            }
            else if(menuChoice < 1 || menuChoice > 4){
                System.out.println("Unrecognized menu choice; please re-enter");
            }
        }while (menuChoice != 4);
    }

}
