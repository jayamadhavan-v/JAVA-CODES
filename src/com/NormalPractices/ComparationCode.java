package com.NormalPractices;

public class ComparationCode {
    public static void main(String[] args) {
        int[] arr ={2, 9, 24, 35, 56, 61, 67, 93};
        /*
         { 1, 28, 36, 44, 48, 64, 78, 78};

         */
        int kIndex = binarySearch(arr , 9);
        System.out.println(kIndex);
    }
    public static int binarySearch(int[] arr, int k) {
        // Code Here
        int low  = 0 ,high = arr.length -1;

        while(low <= high){
            int mid = low + (high -low ) /2;
            if (k == arr[mid] ){
                return mid;
            }
            else if (arr[mid] > k) {
                high = mid -1;
            }
            else {
                low =mid +1;
            }
        }
        return -1;
    }


}
