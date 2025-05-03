package com.DSA;
import java.util.*;

public class SumTriangle {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int len = arr.length;
        int returnValue = sumTriangle(arr,len);
        System.out.println(returnValue);
    }

    static int sumTriangle(int[] arr,int len) {

        if(len == 1){
            return arr[0];
        }
        //int []sumArr = new int[len-1];
        for (int i = 0; i < len-1; i++) {
            int x  =arr[i]+arr[i+1];
            arr[i] = x%10;
        }
        return sumTriangle(arr,len-1);
        //System.out.println(Arrays.toString(sumArr));
    }
}
