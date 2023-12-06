package com.Bridglabz.Stream;

import java.util.Arrays;
import java.util.List;

public class ArrayReduce {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(10,30,20,40);
       int sum=list.stream().reduce(0,(num1,num2)->num1+num2);
        System.out.println(sum);
    }
}
