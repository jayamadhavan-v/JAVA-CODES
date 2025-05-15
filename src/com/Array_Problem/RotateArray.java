package com.Array_Problem;

import java.util.Arrays;

/// [...](https://leetcode.com/problems/rotate-array/description/)
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7}; // {-1,-100,3,99}
        int k = 54944; /// no of rotate
//        rotate(nums, k);
        Solution2 s = new Solution2();
        s.rotate(nums,k);
    }

    static void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
//            int first = nums[0];
            int last = nums[nums.length - 1];
            int s = nums.length - 2;
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[s];
                s--;
            }
            nums[0] = last;
        }
        System.out.println("after Rotation " + Arrays.toString(nums));
    }
}

class Solution2 {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
