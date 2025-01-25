package com.java;

import java.util.Scanner;

public class ConversionTempToScale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double temperature = scanner.nextDouble();

        double celsiusToFahrenheit = (temperature * 1.8) + 32; // Celsius to Fahrenheit
        double celsiusToKelvin = temperature + 273; // Celsius to Kelvin

        System.out.println(temperature + " Celsius = " +celsiusToFahrenheit+ " Fahrenheit");
        System.out.println(temperature + " Celsius = " +celsiusToKelvin+ " Kelvin");


    }

}
