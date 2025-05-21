package com.Array_Problem;
/// [......](https://leetcode.com/problems/longest-consecutive-sequence/description/)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[] nums = //{0,-1};
//                {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
                     //{1, 0, 1, 2};
//                {100,4,200,1,3,2};
                {0,2,2,2,1,1,1,3,3,3,4,4,101,102,103};
//        getSequence1(nums);

        getSequence2(nums);
    }

   /// Better Solution  Tc--> O(N log N)
    static void getSequence1(int[] nums) {
        int lCount = 0 ,count = 0, small =Integer.MIN_VALUE;
        Arrays.sort(nums);
        int i =0 ;
        while(i< nums.length){

            if (nums[i]-1 == small  ) {
                count++;
                small = nums[i];

            }
            else if(nums[i] != small){
                count =1;
                small = nums[i];
            }
            lCount = Math.max(lCount,count);
            i++;
        }
        System.out.println(lCount);
    }

    /// Optimal Solution
    static void getSequence2(int[] nums) {
        // using the hashSet
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){ /// O(N)
            set.add(i);
        }
        int longStreak = 0;
        for (int j : set){
            if(!set.contains(j - 1)) { // previous element is not there mena i will go inside
                int currentNo = j;
                int streak = 1 ;
                while(set.contains(currentNo+1)){
                    currentNo++;
                    streak++;
                }
                longStreak =Math.max(longStreak,streak);
            }
        }
        System.out.println(longStreak);
    }
}
