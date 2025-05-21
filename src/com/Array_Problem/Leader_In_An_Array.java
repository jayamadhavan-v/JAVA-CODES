package com.Array_Problem;

import java.util.ArrayList;

/// [...](https://takeuforward.org/data-structure/leaders-in-an-array/)
public class Leader_In_An_Array {
    public static void main(String[] args) {
        int[] nums = {10, 22, 12, 3, 0, 6};
         getLeader2(nums);
    }
///  Brute Force TC -->O(n^2)
    static void  getLeader1(int[] nums) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            boolean leader = true;
            for (int j = i; j <= nums.length-2; j++) {
                if(nums[i]<nums[j+1]){
                    leader = false;
                    break;
                }
            }
            if(leader){
                myList.add(nums[i]);
            }
        }
        System.out.println(myList);
    }

    /// Optimal Solution
    static void getLeader2(int[] nums){
        ArrayList<Integer> myList = new ArrayList<>();
        int len = nums.length-1;
        int max = Integer.MIN_VALUE;
        while(len>=0){
            if(nums[len]>max){
                myList.add(nums[len]);
                max= nums[len];
            }
            len--;
        }
        System.out.println(myList);
    }
}
