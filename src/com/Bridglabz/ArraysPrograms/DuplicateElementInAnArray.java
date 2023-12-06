package com.Bridglabz.ArraysPrograms;

public class DuplicateElementInAnArray {
    public static void main(String[] args) {
        int arr[]={1,5,3,7,9,4,3,9};
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
