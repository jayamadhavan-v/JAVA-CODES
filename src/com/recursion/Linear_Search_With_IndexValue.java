package com.recursion;

import java.util.ArrayList;

public class Linear_Search_With_IndexValue {
    public static void main(String[] args) {

        int[] arr = {0, 9, 8, 7, 6, 5, 4, 3, 2, 3, 4, 4, 4, 4};
        int target = 4;
        ArrayList<Integer> arrList = getArrayList(arr, 0, target, new ArrayList<>());
        System.out.println(arrList);
    }

    static ArrayList<Integer> getArrayList(int[] arr, int i, int target, ArrayList<Integer> arrList) {
        //base Condition
        if (i == arr.length) {
            return arrList;
        }
        if (arr[i] == target) {
            arrList.add(i);
        }
        return getArrayList(arr, i + 1, target, arrList);
    }
}


