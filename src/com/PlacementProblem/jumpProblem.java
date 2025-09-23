package com.PlacementProblem;

public class jumpProblem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 14, 5, 7, 8, 12, 31, 14, 9};
        int cnt = getSteps(arr);
        System.out.println(cnt);
    }

    public static int getSteps(int[] arr) {

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {

            // it will check whether is there in the array
            boolean isThere = false;

            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isThere = true;
                    i = j;
                }
            }
            if (isThere) {
                cnt++;
                isThere = false;
            } else {
                cnt++;
            }
        }
//  Using to pointer approach

        return cnt;
    }
}
