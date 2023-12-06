package com.Bridglabz.Stream;

import java.util.Arrays;
import java.util.List;

public class ArrayDist {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(12,90,60,20,20,12,10);
      list.stream().sorted().forEach(System.out::println);
    }
}
