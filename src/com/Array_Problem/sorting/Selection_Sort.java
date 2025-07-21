package com.Array_Problem.sorting;


import java.util.Arrays;

import static com.DSA_Concepts.SortingMethods.swapMethod;

///  take the max in the array and swap into last and reduce the array size


public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = getMax(arr,0,last);
            swapMethod(arr,maxIndex,last);
        }
    }
    public static int  getMax(int[] arr,int start,int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
}
