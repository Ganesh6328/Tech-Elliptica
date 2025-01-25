package com.java;

import java.util.Scanner;

public class CheckPositiveNegativeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        if(number >= 0)
        {
            System.out.println("Number " + number  + " is Positive");
        }
        else
        {
            System.out.println("Number " + number + " is Negative");
        }


    }
}
