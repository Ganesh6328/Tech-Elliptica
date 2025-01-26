package com.java;

public class FindFactorNumber {

    public void methodFactor(int number)
    {
        for(int i=1; i<=number; i++)
        {
            if(number % i == 0)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        FindFactorNumber obj = new FindFactorNumber();
        obj.methodFactor(24);
       // FindFactorNumber.methodFactor(10);
    }
}
