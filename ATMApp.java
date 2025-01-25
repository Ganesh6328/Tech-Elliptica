package com.java;

import java.util.Scanner;

public class ATMApp {

    public static void main(String[] args) {
        System.out.println("Welcome to My ATM");
        boolean isContinue = true;
        int balance = 0;

        while(isContinue) {
            System.out.println("======================");
            System.out.println("Press 1 - Check to balance");
            System.out.println("Press 2 - Deposit Money");
            System.out.println("Press 3 - Withdraw Money");
            System.out.println("Press 4 - Exit");
            System.out.println("========================");
            System.out.println("Please enter your choice:");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            System.out.println("User choice: " + choice);
            switch (choice) {
                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;
                case 2:
                    System.out.println("How much amount you want to deposit?");
                    int amount = scan.nextInt();
                    balance += amount;
                    System.out.println("Your amount " + amount + " is added in your balance");
                    break;
                case 3:
                    System.out.println("How much amount you want to withdraw?");
                    int wAmount = scan.nextInt();
                    balance -= wAmount;
                    System.out.println("Thanks for withdraw");
                    break;
                case 4:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Your choice is not correct. Please try later");
            }
        }

        System.out.println("Thanks for using My ATM.");
        System.out.println("======================================");
    }
}
