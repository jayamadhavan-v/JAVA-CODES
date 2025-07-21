package com.Sorting;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        MergeSort m = new MergeSort();
        int[] arr2 = m.mergeSort(arr);
        System.out.println(Arrays.toString(arr2));
    }
}

class MergeSort {
    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;

        //divide the array into two halves

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        //call the merge and sort the array
        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int fLeft = 0, fRight = 0, rCounter = 0;
        //compare elements and merge
        while (fLeft < left.length && fRight < right.length) {
            if (left[fLeft] < right[fRight]) {
                // add into result
                result[rCounter++] = left[fLeft++];
            } else {
                result[rCounter++] = right[fRight++];
            }
        }

        // Copy remaining elements from left
        while (fLeft < left.length) {
            result[rCounter++] = left[fLeft++];
        }

        // Copy remaining elements from right
        while (fRight < right.length) {
            result[rCounter++] = right[fRight++];
        }
        return result;
    }


}