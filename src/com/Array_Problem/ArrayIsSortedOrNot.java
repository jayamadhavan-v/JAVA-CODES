package com.Array_Problem;
import java.util.Arrays;

/// [...](https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/)
public class ArrayIsSortedOrNot {

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2}; // {2,1,3,4}       //{1,2,3}
        boolean answer = check(nums);
        System.out.println("Can be sorted by rotation: " + check(nums));
    

//        int largestNumber = largestNumber(nums);
//        System.out.println(largestNumber);
//
//        int secondLargestNumber = secondLargestNumber(nums);
//        System.out.println(secondLargestNumber);
    }

    static int secondLargestNumber(int[] nums) {
        // without sorting
        int largestNo = nums[0];
        int sLargestNo = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largestNo) {
                sLargestNo = largestNo;
                largestNo = nums[i];
            } else if (nums[i] < largestNo && nums[i] > sLargestNo) {
                sLargestNo = nums[i];
            }
        }
        return sLargestNo;
    }

    static int largestNumber(int[] nums) {

        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            max = Math.max(max, i);
        }
        return max;
    }


    static boolean check(int[] nums) {
        int len = nums.length;
        int count = 0;

        // Try rotating the array up to len times
        for (int i = 0; i < len; i++) {
            if (isSorted(nums)) {
                System.out.println("Sorted array after " + count + " rotations: " + Arrays.toString(nums));
                return true;
            }
            rotateArray(nums);
            count++;
        }

        // If no sorted version found
        System.out.println("Array cannot be sorted by rotation.");
        return false;
    }

    // Helper to check if the array is sorted
    static boolean isSorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        }
        return true;
    }

    // Helper to rotate the array left by 1 position
    static void rotateArray(int[] nums) {
        int first = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = first;
    }


}


