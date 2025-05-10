package com.DSA_Concepts;

import java.util.*;

import static java.util.Arrays.sort;

public class ArrayBasedProblems {
    public static void main(String[] args) {
        int [] arr = {-1,0,1,2,-1,-4};
        int target =0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        reverseTheArray(arr);
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            list.add(new ArrayList<>());
//        }
//        threeSum(arr,target);
    }
/*
    static ArrayList<Integer> threeSum(int[] arr , int target) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        //intialize 
        for(int i=0 ;i< 3; i++){
            list.add(new ArrayList<>());
        }
        
            int i=0,j=i+1,k=j+1;
            int len = arr.length;
            while(k<len){
                if(arr[i] != arr[j] && arr[j] != arr[k] && arr[i] != arr[k]){
                    if(arr[j]+arr[j]+arr[j] == target){
                       // list.get(i).addAll(arr[i],arr[j],arr[k]);
                    }
                }
            }
            return arr;
    }

 */

    static void reverseTheArray(int[] arr) {
        int len = arr.length;
        for(int start=0 ,end = len-1 ;start<end ; start++,end--){
            SortingMethods.swapMethod(arr,start,end);
        }
        System.out.println(Arrays.toString(arr));
    }
}
