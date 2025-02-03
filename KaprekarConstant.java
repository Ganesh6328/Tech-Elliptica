package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class KaprekarConstant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a four-digit number (with at least two different digits): ");
        int number = scanner.nextInt();

        if (number < 1000 || number > 9999 || hasAllSameDigits(number)) {
            System.out.println("Invalid input. Please enter a valid four-digit number with at least two different digits.");
        } else {
            int iterations = 0;
            while (number != 6174) {
                number = kaprekarStep(number);
                iterations++;
                System.out.println("Iteration " + iterations + ": " + number);
            }
            System.out.println("Reached Kaprekar's constant 6174 in " + iterations + " iterations.");
        }
        scanner.close();
    }

    private static boolean hasAllSameDigits(int number) {
        String str = String.valueOf(number);
        char firstChar = str.charAt(0);
        for (char c : str.toCharArray()) {
            if (c != firstChar) {
                return false;
            }
        }
        return true;
    }

    private static int kaprekarStep(int number) {
        String numStr = String.format("%04d", number); // Ensure it's 4 digits
        char[] digits = numStr.toCharArray();

        // Sort digits to get the smallest and largest numbers
        Arrays.sort(digits);
        int small = Integer.parseInt(new String(digits));
        int large = Integer.parseInt(new StringBuilder(new String(digits)).reverse().toString());

        return large - small;
    }
}
