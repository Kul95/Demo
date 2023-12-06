package com.Bridglabz.OOPs;

public class SuperVar {
    int x=20;
    void demo(){
        System.out.println(x);
    }
}
class Demo1 extends SuperVar{
    int x=200;
    void demo(){
        System.out.println(super.x);
    }

    public static void main(String[] args) {
        Demo1 demo1=new Demo1();
        demo1.demo();
    }
}
