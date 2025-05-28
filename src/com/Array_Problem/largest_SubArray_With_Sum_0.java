package com.Array_Problem;

import java.util.HashMap;

public class largest_SubArray_With_Sum_0 {
    public static void main(String[] args) {
        int[] nums =
                {15, -2, 2, -8, 1, 7, 10, 23}
//        {1,-1,3,2,-2,-8,1,7,10,23}
                ;

        //s =largest array Count
        int s = getSub(nums);
        System.out.println(s);
    }

    static int getSub(int[] nums) {
        int len = nums.length;

        int streak =Integer.MIN_VALUE;
        int sum = streak;
        // Using The HashMap Concept
        HashMap<Integer,Integer> mpp =new HashMap<>();//sum,index
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            if(sum == 0){
                streak = i+1;
            }
            else{
                if(mpp.get(sum) != null){
                    streak = Math.max(streak,i- mpp.get(sum));
                }
                else{
                    mpp.put(sum,i);
                }
            }
        }
        return streak;
    }
}
