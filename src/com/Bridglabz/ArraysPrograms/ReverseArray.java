package com.Bridglabz.ArraysPrograms;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 7, 9, 5, 6, 3, 4};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
