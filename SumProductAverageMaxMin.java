package com.java;

import java.util.Scanner;

public class SumProductAverageMaxMin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first numbers:");
        int num1 = scanner.nextInt();
        System.out.println("Enter first numbers:");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        System.out.println("Sum: " +sum);
        System.out.println("Difference: " +difference);
        System.out.println("Product: " +product);

        int average = (num1 + num2) / 2;
        System.out.println("Average: " +average);

        int diffBetweenTwoNumbers = (num1 - num2);
        System.out.println("Distance: " +diffBetweenTwoNumbers);

        int max = (num1 > num2) ? num1 : num2;
        int min = (num1 < num2) ? num1 : num2;

        System.out.println("Max: " +max);
        System.out.println("Min: " +min);



    }
}
