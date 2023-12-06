package com.Bridglabz.ExceptionHandling;

public class NullPointerEx {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
