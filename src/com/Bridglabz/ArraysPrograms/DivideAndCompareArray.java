package com.Bridglabz.ArraysPrograms;

public class DivideAndCompareArray {
    public static void main(String[] args) {
        int arr[]={1,4,8,6,9,4};
        int sum1=0,sum2=0;
        for(int i=0;i<(arr.length)/2;i++){
            sum1=sum1+arr[i];
        }
        System.out.println(sum1);

        for(int i=arr.length/2;i<(arr.length);i++){
            sum2=sum2+arr[i];
        }
        System.out.println(sum2);

        if(sum1==sum2){
            System.out.println("Both are equals");
        }else {
            System.out.println("Both are different...");
        }
    }
}
