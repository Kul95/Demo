package com.Bridglabz.BasicPrograms;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int num1=10,num2=20;
        System.out.println("Before swapping: "+num1+" "+num2);
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping: "+num1+" "+num2);
    }
}
