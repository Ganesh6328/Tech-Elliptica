package com.java;

import java.util.Scanner;

public class FindGreatestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter number 1: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter number 1: ");
        int num3 = scanner.nextInt();

        if(num1 > num2 && num1 > num3)
        {
            System.out.println(num1 + " is a greatest number");
        } else if(num2 > num3 && num2 > num1 )
        {
            System.out.println(num2 + " is a greatest number");
        }else
        {
            System.out.println(num3 + " is a greatest number");
        }
    }
}
