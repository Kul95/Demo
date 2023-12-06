package com.Bridglabz.BasicPrograms;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num1=0,num2=1,num3 = 0;
        int num=7;
        for(int i=2;i<=num;i++){
            num3=num1+num2;
            System.out.print(num3+" ");
            num1=num2;
            num2=num3;
        }
    }
}
