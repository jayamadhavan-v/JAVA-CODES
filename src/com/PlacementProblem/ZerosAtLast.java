package com.PlacementProblem;

import java.util.Arrays;

import static com.Tools.swapMethod;

public class ZerosAtLast {
    public static void main(String[] args) {
//        input
        int[] arr = {0,1,0,3,12};
//                {0, 1, 0, 2, 0, 3, 4, 0, 0};

        letDO(arr);
    }

    public static void letDO(int[] arr) {
//        using the two pointer
        int i = 0 ,j=1;
        while (j < arr.length){
            if(arr[i] == 0){
                swapMethod(arr,i,j);
                j++;
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
