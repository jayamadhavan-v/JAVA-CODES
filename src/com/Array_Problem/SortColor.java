package com.Array_Problem;

import java.util.Arrays;

/// [.............](https://leetcode.com/problems/sort-colors/description/)
public class SortColor {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        // my approach tc-->O(n^2)
//        sortColors(nums);

        // Dutch National Flag Algorithm tc -->O(n)
        optimalSolution(nums);
    }

    ///  Dutch National Flag algorithm
    static void optimalSolution(int[] nums) {

        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                Tools.swapMethod(nums, low, mid);
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else {
                Tools.swapMethod(nums, mid, high);
                high--;
            }
        }//end of While Loop
        System.out.println(Arrays.toString(nums));

    }


    /// my Approach tc-->O(n^2)
    static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = getMin(nums, i, nums.length - 1);
            Tools.swapMethod(nums, i, minIndex);
        }
        System.out.println(Arrays.toString(nums));
    }

    private static int getMin(int[] arr, int start, int end) {
        int min = arr[start];
        int minIndex = arr.length - 1;
        while (start <= end) {
            if (arr[start] < min) {
                minIndex = start;
                min = arr[start];

            }
            start++;
        }
        return minIndex;
    }
}
