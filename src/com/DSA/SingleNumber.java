package com.DSA;
public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {3,3,1,6,-1,1};
        Solution sol = new Solution();
        int singleNumber = sol.singleNumber(arr);
        System.out.println(singleNumber);
    }
}
    class Solution {
        public int singleNumber(int[] arr) {
            if (arr.length == 0) {
                return -1; // Handle empty array case
            }

            int len = arr.length;
            int max = getMax(arr);
            int min = getMin(arr); // Find the minimum value in the array
            int range = max - min + 1; // Range of values for hashing

            int[] hashArr = new int[range]; // Use the range to size the hash array
            int i = 0;

            // Normalize the index by subtracting the min value
            while (i < len) {
                hashArr[arr[i] - min]++; // Normalize the index
                i++;
            }

            int j = 0;
            while (j < range) {
                if (hashArr[j] == 1) {
                    return j + min; // Return the original value (normalize the index)
                }
                j++;
            }

            return -1;
        }

        // Get maximum value in the array
        public int getMax(int[] arr) {
            int max = Integer.MIN_VALUE;
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        }

        // Get minimum value in the array
        public int getMin(int[] arr) {
            int min = Integer.MAX_VALUE;
            for (int i : arr) {
                if (i < min) {
                    min = i;
                }
            }
            return min;
        }
    }

