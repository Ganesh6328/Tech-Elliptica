package com.java;

import java.util.Scanner;

public class DisplayNameOfWeekday {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number between 1 to 7:");
        int day = scanner.nextInt();
        String dayName = switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid input";
        };
        System.out.println(day + " - " +dayName);

    }
}
