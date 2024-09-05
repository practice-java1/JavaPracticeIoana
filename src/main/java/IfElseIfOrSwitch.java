package main.java;

import java.util.Scanner;

public class IfElseIfOrSwitch {

    /*
__- Exercise: Day of the Week
__- Problem Statement:
__- Write a Java program that takes an integer input from the user representing a day of the week (1 for Monday, 2 for Tuesday, etc.),
and then prints the corresponding day as a string.

    If the user enters a number outside the range 1-7, the program should print "Invalid day."

    Initially, implement this using if-else if statements. Then, refactor the code to use a switch statement.
     */

    //    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt user to enter a number for the day of the week
//        System.out.print("Enter a number (1-7) for the day of the week: ");
//        int Number = scanner.nextInt();
//
//        String dayName;
//
//        // Use if-else if to determine the day of the week
//        if (day == 1) {
//            dayName = "Monday";
//        } else if (day == 2) {
//            dayName = "Tuesday";
//        } else if (day == 3) {
//            dayName = "Wednesday";
//        } else if (day == 4) {
//            dayName = "Thursday";
//        } else if (day == 5) {
//            dayName = "Friday";
//        } else if (day == 6) {
//            dayName = "Saturday";
//        } else if (day == 7) {
//            dayName = "Sunday";
//        } else {
//            dayName = "Invalid day";  // Handle invalid input
//        }
//
//        // Print the day of the week
//        System.out.println("The day is: " + dayName);
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number for the day of the week
        System.out.print("Enter a number (1-7) for the day of the week: ");
        int day = scanner.nextInt();

        String dayName;

        // Use switch to determine the day of the week
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";  // Handle invalid input
                break;
        }

        // Print the day of the week
        System.out.println("The day is: " + dayName);
    }
}


