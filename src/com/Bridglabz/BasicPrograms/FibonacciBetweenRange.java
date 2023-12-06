package com.Bridglabz.BasicPrograms;

public class FibonacciBetweenRange {
    public static void main(String[] args) {
        int lowerLimit = 10;
        int upperLimit = 20;
        System.out.println("Fibonacci numbers between " + lowerLimit + " and " + upperLimit + ":");
        int n = 20, t1 = 0,t2 = 1;
        while (t1 <= n)
        {
           if (t1 >= 10)
            System.out.print(t1+" ");
           int temp = t1 + t2;
           t1 = t2;
           t2 = temp;
        }


    }
}
