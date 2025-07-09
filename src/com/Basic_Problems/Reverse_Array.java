package com.Basic_Problems;

import java.util.Arrays;

public class Reverse_Array {
    int[] arr;
    int len ;

    public Reverse_Array(int[] arr) {
        this.arr = arr;
    }

    public void ReverseIt(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int dummy = arr[start];
            arr[start] = arr[end];
            arr[end] = dummy ;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
class demo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2};
        Reverse_Array r = new Reverse_Array(arr);
        r.ReverseIt(arr);
    }
}
