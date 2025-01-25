package com.java;

import java.util.Scanner;

public class ConversionSecondToHourMinuteSeconds {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input in seconds:");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println(hours + " hours " +minutes+ " minutes " +seconds + " seconds");

        scanner.close();
    }
}
