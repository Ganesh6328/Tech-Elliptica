package com.java;

import java.util.Scanner;

public class FindNumberOfDaysInMonth {
    int month;
    int days31 = 31;
    int days28 = 28;
    int days30 = 30;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input: ");
        int month = scanner.nextInt();
        //int month = 0;

        FindNumberOfDaysInMonth find = new FindNumberOfDaysInMonth();
        find.month = month;
       // find.usingIf();
        find.usingSwitch();

        scanner.close();

    }

    public void usingIf() {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Days in months is: " + days31);
        } else if (month == 2) {
            System.out.println("Days in months is: " + days28);
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Days in months is: " + days30);
        } else {
            System.out.println("Invalid input");
        }


    }

    public void usingSwitch() {

        switch (month) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Days in months is: " + days31);
                break;
            case 2:
                System.out.println("Days in months is: " + days28);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Days in months is: " + days30);
                break;
            default:
                System.out.println("Invalid input");


        }


    }


}
