package com.java;

import java.util.Scanner;

public class ConversionMinutesIntoYearsDays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Minutes: ");
        if(scanner.hasNextInt())
        {
            int minutes = scanner.nextInt();
            int years = minutes / (60*24*365);
            int days = minutes / (60*24);
            System.out.println("Days: " +days+  " Years: " +years);
        }
        else
        {
            System.out.println("Invalid input");
        }


    }
}
