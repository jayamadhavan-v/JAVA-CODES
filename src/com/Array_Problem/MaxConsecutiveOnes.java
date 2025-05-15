package com.Array_Problem;
///[...](https://leetcode.com/problems/max-consecutive-ones/description/)
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1};
        int consecutive = getConsecutive(arr);
        System.out.println(consecutive);
    }

    static int getConsecutive(int[] nums) {
        int count  = 0 ,maxC = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                count++;
                maxC= Math.max(maxC,count);
            }
            else{
                count =0;
            }

        }
        return maxC;
    }
}
