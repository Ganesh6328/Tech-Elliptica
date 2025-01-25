package com.java;

import java.util.Scanner;

public class ConversionInchesToMeter {

    public static void main(String[] args) {
        double inchToMeter = 0.0254;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length in inches:");
        if (scanner.hasNextDouble()) {
            double inches = scanner.nextDouble();
            double meter = inches * 0.0254;
            String result = String.format("%.2f", meter);
            System.out.println(result);
        } else {
            System.out.println("Invalid output");
        }

        scanner.close();
    }
}
