package com.recursion;

public class isArraySort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 6, 7, 8};
        boolean s = isArraySort1(0,arr);
        System.out.println(s);
    }
    public static boolean isArraySort1(int i ,int[] arr){

        if(arr[i]>arr[i+1]){
            return false;
        }
        // bae condition
        if(i+1== arr.length-1){
            return true;
        }
        return isArraySort1(i+1, arr);

    }
}
