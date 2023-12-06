package com.Bridglabz.ArraysPrograms;

public class SumOfArray {
    public static void main(String[] args) {
        int arr[]={1,3,8,6,4};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
