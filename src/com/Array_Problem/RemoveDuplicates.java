package com.Array_Problem;

import java.util.Arrays;

/// [...](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2};//{0,0,1,1,1,2,2,3,3,4}
        int uniqueCount = removeDuplicates(nums);
        System.out.println(uniqueCount);
    }

    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // slow pointer
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; // overwrite duplicates
            }
            System.out.println(Arrays.toString(nums));
        }
        return i + 1; // new length
    }


}
