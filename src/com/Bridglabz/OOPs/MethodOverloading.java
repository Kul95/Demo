package com.Bridglabz.OOPs;

public class MethodOverloading {
    public static int demo(int x,int y){
        return x+y;
    }
    public static double demo(double x,double y){
        return x+y;
    }
    public static void main(String[] args) {
        System.out.println(MethodOverloading.demo(10,20));
        System.out.println(MethodOverloading.demo(20.6,10.2));
    }
}
