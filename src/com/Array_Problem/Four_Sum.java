package com.Array_Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Four_Sum {
    public static void main(String []args){
        int[] nums= {1, 0, -1, 0, -2, 2};
        List<List<Integer>> fourSum = getFourSum(nums);
        System.out.println(fourSum);
    }
    static List<List<Integer>> getFourSum (int[] nums){
        // using the List<List<Integer>>
        List<List<Integer>> myList = new ArrayList<>();

        // sorting the Array For the Two Pointer Concepts
        Arrays.sort(nums);

        int n = nums.length , k =0;

        //For Loop For the First Element
        for (int i = 0; i < n-3; i++) {
            // it Will Check THe Next With Previous Number
            if(i> 0 && nums[i] == nums[i-1]) continue;

            // Second for Loop for the Accessing the next Element

            for (int j = i+1; j < nums.length-2; j++) {

                if(j>i+1 && nums[j] == nums[j-1]) continue;

                // now using the left answer right concept from the Three sum

                int left = j+1; // i =0 j =1 so left = 3;
                int right = nums.length-1;

                while(left<right){
                    long sum = (long) nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum == k) {
                        myList.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Skip duplicates for the second and third elements
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    }
                    else if(sum < k){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return myList;
    }
}
