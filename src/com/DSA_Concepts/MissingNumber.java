package com.DSA_Concepts;
import java.util.Arrays;
import java.util.Scanner;

/// hints distint number

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        //Scanner.close();
        // print the array
        System.out.println(" given Array is "+ Arrays.toString(arr));
        int missingnumber = missingNumber(arr);
        System.out.println("missing Number is " + missingnumber);
    }

    static int missingNumber(int[] arr) {
        /// https://leetcode.com/problems/missing-number/description/
        int len = arr.length;
        int i=0;
        while(i<len){

            if(arr[i]< len && arr[i] != arr[arr[i]]){
                SortingMethods.swapMethod(arr,i,arr[i]);
            }else{
                i++;
            }
        }
        for (int j = 0; j < len ; j++) {
            if (j != arr[j]) {
                    return j;
            }
        }
        return len;
    }

}
