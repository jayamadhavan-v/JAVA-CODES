package com.TRAINING_SESSION_QUESTION;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        reverse(arr);
    }

    static void reverse(int[] arr) {
        int n = arr.length-1;
        for (int i = 0; i < arr.length /2; i++) {
            swapMethod(arr,i,n);
            n--;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swapMethod(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }
}
