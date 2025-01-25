package com.java;
import java.util.Scanner;

public class SquareAndCubeAndFourthPower {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);
        double fourthPower = Math.pow(number, 4);

      /*
      //integer datatype
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int square = (int)Math.pow(number, 2);
        int cube = (int)Math.pow(number, 3);
        int fourthPower = (int)Math.pow(number, 4);*/

        System.out.println("Square: " +square);
        System.out.println("Cube: " +cube);
        System.out.println("Fourth Power: " +fourthPower);

        scanner.close();

    }


}
