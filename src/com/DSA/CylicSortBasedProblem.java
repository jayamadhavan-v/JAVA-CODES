package com.DSA;

import java.util.Arrays;

public class CylicSortBasedProblem {
    // all The question of which will have This keywords as range of 1 to n
    public static void main(String[] args) {
        int [] arr={9,6,4,2,3,5,7,0,1};
        /*
        missingNumber
        arr = {3,0,1} --> 2
        arr={0,1}-->2
        arr={9,6,4,2,3,5,7,0,1} -->8
         */
       System.out.println(missingNumber(arr));
//        int [] nums ={4,3,2,7,8,2,3,1} ;
        /*
        Disappeared number in Array
        nums = {4,3,2,7,8,2,3,1} --> 5,6
        nums = {1,1} --> 2
         */
//       disappearedNoInArray(nums);
        /*
        arr1 ={1,3,4,2,2};
        arr1={4,3,2,7,8,2,3,1};
        arr1={1,2,2,4};
         */
        int [] arr1={1,2,2,4};
//        System.out.println(findDuplicateNo(arr1));
        /// the above is only to find the only one element which is repeated
        /// other we wanna we disappearedNoInArray() only.
        /*
        nums = {1,2,2,4}
        nums = {1,1}
         */
//        int []  nums = {2,1,2,4};
//        int [] output = setMismatch(nums);
//        System.out.println(Arrays.toString(output));
        /*
            41. First Missing Positive
            {1,2,0}-->3
            {3,4,-1,1}-->2
            {7,8,9,11,12}-->1
         */
//        int [] arr = {2147483647,2147483646,2147483645,3,2,1,-1,0,-2147483648};
//        System.out.println(firstMissingPositive(arr));



    }

    static int firstMissingPositive(int[] arr) {
        ///https://leetcode.com/problems/first-missing-positive/
        int len = arr.length;
        int i =0;
        while(i<len){
            int index= arr[i]-1;
            if(index > 0 && index <len && arr[i]!= arr[index]){
                swapMethod(arr,i,index);
            }
            else{
                i++;
            }
        }

        for (int index = 0; index < len; index++) {
            if (arr[index] != index+1) {
                return index+1;
            }
        }
        return len+1;
    }

    static int[] setMismatch(int[] arr) {
        ///https://leetcode.com/problems/set-mismatch/
        int len = arr.length;
        int i =0;
        while(i<len){
            int index= arr[i]-1;
            if(arr[i]!= arr[index]){
                swapMethod(arr,i,index);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int index = 0; index < len; index++) {
            if (arr[index] != index+1) {
                return new int[]{arr[index],index+1};
            }
        }
        return new int []{-1,-1};
    }

    static int findDuplicateNo(int[] arr1) {
        /// https://leetcode.com/problems/find-the-duplicate-number/
        int i=0 , len = arr1.length;


        while (i<len){
            /// used for single nums
            if(arr1[i] != i+1){// value = index +1; 1 == 0+1;--> correct

                int cIndex = arr1[i]-1; /// inputs which doesn't contain 0 to correctIndex = value -1
                if(arr1[i] != arr1[cIndex]){
                    swapMethod(arr1,i,cIndex);
                }
                else{
                    return arr1[i]  ;
                }
            }
            else{
                i++;
            }
        }


    return -1;
    }

    static void disappearedNoInArray(int[] nums) {
        int len =nums.length;
        int i=0;
        while(i<len){
            int index = nums[i]-1; /// inputs which doesn't contain 0 to index = value -1
            if(nums[i] != nums[index]){
                swapMethod(nums,i,index);
            }
            else{
                i++;
            }
        }
        int [] arr1 = new int[4];
        int k=0;
        for (int index = 0; index < len ; index++) {
            if(nums[index] != index+1){
                arr1[k]=nums[index] ;//index+1;
                k++;
            }

        }

        System.out.println(Arrays.toString(arr1));
    }

    static int missingNumber(int[] arr) {
        /// https://leetcode.com/problems/missing-number/description/
        int len = arr.length;
        int i =0;
        while(i<len){
            int index= arr[i];
            if(index<len && arr[i]!= arr[index]){
                swapMethod(arr,i,index);
            }
            else{
                i++;
            }
        }
        // to find the missing number
        for (int index = 0; index < len; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return len;
    }

    static void swapMethod(int[] arr,int first, int second) {
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;

    }


}///main method
