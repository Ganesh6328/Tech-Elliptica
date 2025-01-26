package com.java;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input: ");
        int num = scanner.nextInt();
        System.out.println("Fibonacci Series");

        int temp = 0;
        int temp1 = 1;

        for(int i = 1; i <= num; i++)
        {
            System.out.println(temp + " ");
            int temp2 = temp + temp1;
            temp = temp1;
            temp1 = temp2;

            scanner.close();

        }
    }
}
