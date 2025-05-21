package com.Array_Problem;
import com.DSA_Concepts.SortingMethods;

import java.util.Arrays;

/// hints distint number
///   [...](https://leetcode.com/problems/missing-number/description/)

public class Missing_Number {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i]=sc.nextInt();
//        }
        int[] arr ={0,3,7,2,5,8,4,6,0,1};
//                {1,0,1,2};
//                {9,6,4,2,3,5,7,0,1};
        //Scanner.close();
        // print the array
        System.out.println(" given Array is "+ Arrays.toString(arr));
        int missingNumber = missingNumber(arr);
        System.out.println("missing Number is " + missingNumber);
    }

    static int missingNumber(int[] arr) {

        int len = arr.length;
        int i=0;
        while(i<len){

            if(arr[i]< len && arr[i] != arr[arr[i]]){
                SortingMethods.swapMethod(arr,i,arr[i]);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < len ; j++) {
            if (j != arr[j]) {
                    return j;
            }
        }
        return len;
    }

}
