package com.Bridglabz.OOPs;

public class SuperClass {
    void demo(){
        System.out.println("Hello");
    }
}
class Demo3 extends  SuperClass{
    void demo(){

        System.out.println("Hi");
    }

    public static void main(String[] args) {
        Demo3 demo3=new Demo3();
        demo3.demo();

    }
}
