package com.Array_Problem;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {1, 2,3,1, 3, -1, 0, 1, -1,1,1,2, 2};
        int k = 4;// {1,2,3,1,1,1,4,2,3};
        getSubArray(arr, k);
//        int c =getLongestSubArray(arr,k);
//        System.out.println(c);
    }
 ///  my approach but is wrong
    static void getSubArray(int[] arr, int k) {
        int maxLen = 0, sum = 0;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            len++;
            if (sum == k) {
                maxLen = Math.max(maxLen, len);
                sum = 0;
                len = 0;
            } else if (sum > k) {
                sum = 0;
                len = 0;
            }
        }
        System.out.println(maxLen);

    }

    public static int getLongestSubArray(int[] a, int k) {
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }


}



