package com.Bridglabz.ArraysPrograms;

public class SortArrayElements {
    public static void main(String[] args) {
        int arr[]={1,6,3,9,6,4,3,8,7};
        int size= args.length;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
