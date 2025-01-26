package com.java;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        int temp = 0;

        for(int i = 2; i<=number-1; i++)
        {
            if(number%i==0)
            {
                temp = temp+1;
            }
        }
        if (temp > 0)
        {
            System.out.println("Not prime");
        }
        else
        {
            System.out.println("prime number");
        }
    }
}
