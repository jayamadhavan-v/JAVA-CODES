package com.recursion;

import java.util.Arrays;

import static com.DSA_Concepts.SortingMethods.swapMethod;

///  Reverse on Array using Recursion
public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,2};
        int start = 0 ,end = arr.length;
//        doReverse(arr,start,end);
        anotherMethod(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }

    public static void doReverse(int[] arr, int start, int end) {
        //base condition
        if(start >= end){
            return;
        }
        swapMethod(arr,start,end);
        start++;
        end--;
        doReverse(arr,start,end);
    }
    public static void anotherMethod(int[] arr, int i, int n) {
        //base condition
        if(i >= n/2){
            return;
        }
        swapMethod(arr,i,n-i-1);
        anotherMethod(arr,i+1,n);
    }
}
