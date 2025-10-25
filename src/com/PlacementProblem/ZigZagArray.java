package com.PlacementProblem;

import java.util.Arrays;

public class ZigZagArray {
    public static void main(String[] args) {
        int[] arr =
                {1, 2, 3, 4, 5, 6, 7, 8}
//                {8,7,6,5,4,3,2,1}
//                {95,3,2,4,7,6,10,8,6}
                ;

///  big and small

        for (int i = 0; i < arr.length-1; i+=1) {
///  even wanna be big
            if (i%2 ==0 && arr[i] < arr[i + 1]) {
                swapIt(arr, i,i + 1);
            }
            else{
                if(i%2 !=0 && arr[i] > arr[i+1]) {
                swapIt(arr, i, i + 1);
            }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swapIt(int[] arr, int first, int second) {
        arr[first] = arr[first] + arr[second];
        arr[second] = arr[first] - arr[second];
        arr[first] = arr[first] - arr[second];
    }
}
