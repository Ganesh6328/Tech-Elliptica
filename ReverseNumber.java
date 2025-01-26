package com.java;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class ReverseNumber {

    static int reverse = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        while(number > 0)
        {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}
