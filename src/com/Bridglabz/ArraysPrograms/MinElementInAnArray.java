package com.Bridglabz.ArraysPrograms;

public class MinElementInAnArray {
    public static void main(String[] args) {
        int arr[]={1,4,8,9,5,6};
        int sum1=0;
        int sum2=0;
        for(int i=arr.length/2;i< arr.length;i++){
            sum1=sum1+arr[i];
        }
        System.out.println(sum1);
    }
}
