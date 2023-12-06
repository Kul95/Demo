package com.Bridglabz.ExceptionHandling;

public class AirthmaticEx {
    public static void main(String[] args) {
        int num=18;
        try {
          int div=num/0;
        System.out.println(div);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("Arithmatic exception Occurs");
        }
    }
}
