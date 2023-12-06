package com.Bridglabz.ArraysPrograms;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7};
        int num=arr.length+1;
        int sum=0;
int sum1=(num*(num+1))/2;
        System.out.println("Sum1 : "+sum1);
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
        System.out.println("Missing number in an array: "+(sum1-sum));
    }
}
