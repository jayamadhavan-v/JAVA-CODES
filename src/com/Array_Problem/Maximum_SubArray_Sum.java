package com.Array_Problem;

public class Maximum_SubArray_Sum {
    public static void main(String[] args) {
        int[] arr = {22, 31, 4, -1, -2, 1, -1, 5, -3};
        kadaneS_alg(arr);

    }

    static void kadaneS_alg(int[] arr) {
        int len = arr.length;
        int sum = 0, max = Integer.MIN_VALUE;
        int subArrayStarting = 0, subArrayEnding = 0;
        for (int i = 0; i < len; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
                subArrayEnding = i;
            }
            if (sum < 0) {
                sum = 0;
                subArrayStarting = i + 1;
            }
        }
        if (max < 0) { // max is negative number means max will be zero only
            max = 0;
            System.out.println(max);
        } else {
            System.out.println(max);
        }
        System.out.print("[");
        for (int i = subArrayStarting; i <= subArrayEnding; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
}
