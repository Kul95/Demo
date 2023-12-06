package com.Bridglabz.Stream;

import java.util.Arrays;
import java.util.List;

public class ArrayMul {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5);
        list.stream().map(i->i*5).forEach(System.out::println);
    }
}
