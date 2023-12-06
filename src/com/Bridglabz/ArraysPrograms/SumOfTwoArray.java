package com.Bridglabz.ArraysPrograms;

public class SumOfTwoArray {
    public static void main(String[] args) {
        int arr1[]={1,4,8,5};
        int arr2[]={1,4,8,5};
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println();
        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        int arr3[]=new int[arr1.length];
        for (int i=0;i<arr3.length;i++){
            arr3[i]=arr1[i]+arr2[i];
        }
        System.out.println();
     for (int i=0;i< arr1.length;i++){
         System.out.print(arr3[i]+" ");
     }
    }
}
