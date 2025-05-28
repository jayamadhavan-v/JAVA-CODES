package com.Array_Problem;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.HashMap;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        int k = 0;
        List<List<Integer>> threeSum = getThreeSum1(nums,k);
        System.out.println(threeSum);
        }

//    static List<List<Integer>> getThreeSum(int[] nums, int k) {
//        // sorting the array
//        Arrays.sort(nums);
//        //using the Hashmaps
//        HashMap<Integer,Integer> hash = new HashMap<>();
//        return
//    }

    static List<List<Integer>> getThreeSum1(int[] nums, int k) {
        Arrays.sort(nums); // Important for two-pointer technique

        List<List<Integer>> myList = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == k) {
                    myList.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for the second and third elements
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < k) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return myList;
    }
    }



