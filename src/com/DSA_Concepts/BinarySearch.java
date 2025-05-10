package com.DSA_Concepts;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={2, 9, 24, 35, 56, 61, 67, 93}; //9
        /*
        {1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5};//3
         { 1, 28, 36, 44, 48, 64, 78, 78}; 1
         {2, 9, 24, 35, 56, 61, 67, 93}; 9

         */
        int kIndex = binarySearch(arr , 9);
        System.out.println(kIndex);
    }
    static int binarySearch(int[] arr, int k) {
        // Code Here
        int low  = 0 ,high = arr.length -1;
///         -->  in case repeated number in array use the variable and store the index in that
        int result = -1;

        while(low <= high){

            int mid = low + (high -low ) /2;

            if (k == arr[mid] ){
                result= mid;
                high = mid -1;
            }

            else if (arr[mid] > k) {
                high = mid -1;
            }

            else {
                low =mid +1;
            }
        }
        return result;
    }


}
