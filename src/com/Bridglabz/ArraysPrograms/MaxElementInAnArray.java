package com.Bridglabz.ArraysPrograms;

public class MaxElementInAnArray {
    public static void main(String[] args) {
        int arr[]={1,4,3,7,9,5};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
