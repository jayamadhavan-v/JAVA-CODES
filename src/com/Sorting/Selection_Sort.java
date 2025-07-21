package com.Sorting;

import java.util.Arrays;

import static com.Tools.getMaxIndex;
import static com.Tools.swapMethod;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = //{5, 4, 3, 2, 1};
        {4,3,2,8,1};
        int n = arr.length - 1;
//        selection(arr, n, 0);
        selection1(arr, arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }


    ///  selection sort means it will get the max and put it into last
    static void selection(int[] arr, int n, int i) {
        if (n == 0) {
            return;
        }
        swapMethod(arr, n, getMaxIndex(arr, n));
        n=n-1;
        selection(arr, n, i + 1);
    }

    static void selection1(int[] arr, int n, int i, int max) {
        if (n == 0) {
            return;
        }
        if (i < n) {
            if(arr[i] > arr[max]){
                selection1(arr,n,i+1,i);
            }else {
                selection1(arr, n, i + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[n-1];
            arr[n-1] = temp;
            selection1(arr,n-1,0,0);
        }
    }

}
