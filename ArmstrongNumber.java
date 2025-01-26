package com.java;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int number = 371;
        int temp = number;
        int leng = 0;
        while(temp != 0)
        {
            leng = leng + 1;
            temp = temp / 10;

        }
       // System.out.println("Length of: " +leng);
        int temp2 = number;
        int arm = 0;
        int rem;
        while (temp2 != 0)
        {
            int mult = 1;
            rem = temp2 % 10;
            for(int i=1; i<=leng; i++)
            {
                mult = mult * rem;
            }
            arm = arm + mult;
            temp2 = temp2 / 10;
        }
        //System.out.println(arm);
        if(arm == number)
        {
            System.out.println(number + " is Armstrong number");
        }
        else
        {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}
