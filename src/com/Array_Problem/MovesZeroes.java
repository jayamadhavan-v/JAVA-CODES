package com.Array_Problem;

import java.util.Arrays;

import static com.Array_Problem.Tools.swapMethod;

/// [...](https://leetcode.com/problems/move-zeroes/)
public class MovesZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        movesZeroes(nums);
    }

    static void movesZeroes(int[] nums) {

        // using two pointer

        //step 1:  to find the zero contain location
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                j = i;
                break;
            }
        }
        if(j==-1){
            System.out.println(Arrays.toString(nums));
            return;
        }
        for (int i = j+1 ; i < nums.length; i++) {

            if(nums[i] != 0){
                swapMethod(nums,i,j);
                j++;
            }

        }
        System.out.println(Arrays.toString(nums));

    }


}
