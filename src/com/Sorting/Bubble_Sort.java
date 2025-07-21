package com.Sorting;

import java.util.Arrays;

import static com.DSA_Concepts.SortingMethods.swapMethod;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        letsSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
/// bubble sort means the max will be in tht last
    static void letsSort(int[] arr, int n, int i) {
        if (n == 0) {
            return;
        }
        if (i < n) {
            if(arr[i] > arr[i+1]){
                swapMethod(arr,i,i+1);
            }
            letsSort(arr, n, i + 1);
        } else {
            letsSort(arr, n - 1, 0);
        }
    }
}
