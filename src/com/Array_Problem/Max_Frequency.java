package com.Array_Problem;
import java.util.Arrays;

public class Max_Frequency {
    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        long sum = 0;
        int maxFreq = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            // Check if we can afford to make all elements equal to nums[right]
            while ((long) (right - left + 1) * nums[right] - sum > k) {
                sum -= nums[left];
                left++;
            }

            maxFreq = Math.max(maxFreq, right - left + 1);
        }

        return maxFreq;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,8,13};
        int k = 5;
        System.out.println("Maximum frequency: " + maxFrequency(arr, k));  // Output: 3
    }
}
