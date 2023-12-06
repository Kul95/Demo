package com.Bridglabz.OOPs;

public class SuperMeth {
    void speed() {
        System.out.println("My car speed is 20km/h ");
    }

}
class Demo2 extends SuperMeth{
    void speed(){
        System.out.println("My car speed is 100km/h");
    }
    void work(){
        super.speed();
    }

    public static void main(String[] args) {
        Demo2 demo2=new Demo2();
//        demo2.speed();
        demo2.work();

    }
}