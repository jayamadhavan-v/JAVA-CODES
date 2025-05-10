package com.DSA;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 3};
        /*
        1, 2, 4, 5, 7, 8, 3
        1,2,10,3,5,6,4
         */
        int peakElement = getPeakElement(arr);

        System.out.println(peakElement);

        peakElement = peakElement(arr);
        System.out.println(peakElement);
    }

    static int getPeakElement(int[] arr) {
///     --> brute force
///     --> Time Complexity O(n)

        int len = arr.length; //  to get length of the array

        int peakElement = Integer.MIN_VALUE;
        int peakElementIndex = 0;
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                if (arr[i + 1] > peakElement) {
                    peakElement = arr[i + 1];
                    peakElementIndex = i + 1;
                }
            }
        }
        return peakElementIndex;
    }

    static int peakElement(int[] arr) {
///         --> optimal Solution
///         --> Time Complexity O(log n)

        int low = 0, high = arr.length - 1;

        while (low < high) { //  low == high then while loop will be break

            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Peak must be to the right
                low = mid + 1;
            } else {
                // Peak is to the left or could be mid
                high = mid;
            }
        }

        return low; // or high (since low == high at end)
    }
}

