package com.Bridglabz.OOPs;

public class MethodOverr {
    void run(){
        System.out.println("Bike is running");
    }
}
class Demo extends MethodOverr{
    void run(){

        System.out.println("Car is running");
    }

    public static void main(String[] args) {
        Demo demo=new Demo();
        demo.run();
    }
}
