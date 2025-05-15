package com.Array_Problem;

import java.util.Arrays;
import java.util.HashMap;
/// [...............](https://leetcode.com/problems/two-sum/description/)
public class TwoSum {
    public static void main(String[] args) {
        int[] arr= {2,6,5,8,11};
        int target = 14;
        //brute force
//        int[] c= getTwoSum1(arr,target);
        int [] c  =getTwoSumIndices(arr,target);

        System.out.println(Arrays.toString(c));

        String yesOrNo= getTwoSum2(arr,target);

        System.out.println(yesOrNo);
    }

    static int[] getTwoSumIndices(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < arr.length; i++) {
            int b = target - arr[i];

            if (map.containsKey(b)) {
                return new int[]{ map.get(b), i }; // found indices
            } else {
                map.put(arr[i], i); // store value with its index
            }
        }
        return new int[]{ -1, -1 }; // not found
    }

    ///  Better Solution using HashMap
    static String getTwoSum2(int[] arr, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            // a + b = target --> b = target - a;
            int b = target - arr[i];

            if(map.containsValue(b)){
                 return "yes" ;                      //  return new int[]{ arr[i],map.get(b)};
            }
            else{
                map.put(i,arr[i]);
            }
        }
        return "NO";    //new int []{-1};

    }

    /// my Approach tc = O(n^2) brute force
    static int[] getTwoSum1(int[] arr, int tar) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]+arr[j] == tar){
                    return new int[]{arr[i] , arr[j] };// arr[j]]
                }
            }
        }
        return new int[]{-1};
    }
}

