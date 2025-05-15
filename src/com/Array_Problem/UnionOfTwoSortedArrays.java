package com.Array_Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static com.Array_Problem.Tools.getMax;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {14, 2, 31, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 13};
        //int[] arr1 = {1,2,3,4,5};
        //int[] arr2 = {2,3,4,4,5};
//        union(arr1, arr2);
        toUnion(arr1,arr2);
    }

    static void toUnion(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> union = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            union.put(arr1[i],union.getOrDefault(arr1[i],0)+1);
        }
        for (int i = 0; i < arr2.length; i++) {
            union.put(arr2[i],union.getOrDefault(arr2[i],0)+1);
        }
        for (Integer key : union.keySet()) {
            System.out.println("Key: " + key + ", Value: " +union.get(key));
        }
        // Storing the value in the Array this
        ArrayList<Integer> myList = new ArrayList<>();

        myList.addAll(union.keySet());

        System.out.println(myList);
    }

    static void union(int[] arr1, int[] arr2) {


        // getting max for from arr1
        int max1 = getMax(arr1);
        int max2 = getMax(arr2);
//              System.out.println(max1+"  "+ max2);
        int finalMax = Math.max(max1, max2);
        int[] hArr = new int[finalMax + 1];

        int len = (arr1.length) + (arr2.length);
//        System.out.println(len);

        for (int i = 0; i < arr1.length; i++) {
            hArr[arr1[i]]++;

        }
        for (int i = 0; i < arr2.length; i++) {

            hArr[arr2[i]]++;
        }

//        System.out.println(Arrays.toString(hArr));

        //using ArrayList
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < hArr.length; i++) {
            if (hArr[i] != 0) {
                myList.add(i);
            }
        }
            System.out.println("union array  " + myList);
        }
    }
