package com.Bridglabz.ExceptionHandling;

public class ArrayIndexOutOfBoundExceptionEx {
    public static void main(String[] args) {
        try {


            int arr[] = {1, 3, 6, 9, 7, 3};
            for (int i = 0; i <= arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();

        }
    }
}
