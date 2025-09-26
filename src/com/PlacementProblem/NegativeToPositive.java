package com.PlacementProblem;

import java.util.Arrays;
import static com.Tools.swapMethod;
public class NegativeToPositive {
    public static void main(String[] args) {
//        input
        int[] arr ={-8,4,3,5,-4,6,-5,9};
        letOrderIt(arr);
    }

    public static void letOrderIt(int[] arr) {
        int k=0;
        while(k < arr.length){
            int i =0, j=1;
            while (i< arr.length){
                if(arr[i]>0){
                    swapMethod(arr,i,j);
                    i++;
                }
                else{

                    j++;
                }
            }
            k++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
