package com.Array_Problem;

import java.util.Arrays;
import static com.Tools.swapMethod;
/// [......](https://leetcode.com/problems/rearrange-array-elements-by-sign/description/)
public class RearrangeArrayBySign {
    public static void main(String[] args) {
        int[]  nums =
//                {-1,1};
                {3,1,-2,-5,2,-4,};
        // fist approach
//        getRearrange(nums);
        // second approach
        getRearrange2(nums);
        System.out.println();
        // third approach
        getRearrange3(nums);

    }

    static void getRearrange3(int[] nums) {
        int[] arr = new int[nums.length];
        int p = 0 ,n = 1;
        for (int i : nums){
            if(i>0){
                arr[p] = i;
                p +=2; // postive order is 0 2 4 6
            }
            else{
               arr[n]=i;
                n+=2; // negative order 1 3 5 7 9
            }
        }
//        p =0; n= 0;
//        for (int i =1 ;i<= nums.length;i++){
//            if(i %2 ==1) { //odd so pos
//                nums[i - 1] = pos[p];
//                p++;
//            }
//            else{ //even
//                nums[i - 1] = neg[n];
//                n++;
//            }
//        }
        System.out.println(Arrays.toString(arr));
    }

    /// My Approach Tc O(N) Sc 0(N)
    static void getRearrange2(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int p = 0 ,n = 0;
        for (int i : nums){
            if(i>0){
                pos[p] = i;
                p++;
            }
            else{
                neg[n]=i;
                n++;
            }
        }
        p =0; n= 0;
        for (int i =1 ;i<= nums.length;i++){
            if(i %2 ==1) { //odd so pos
                nums[i - 1] = pos[p];
                p++;
            }
            else{ //even
                nums[i - 1] = neg[n];
                n++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }

    ///  my Approach is wrong
    /*
        input : [3,1,-2,-5,2,-4]
        my output : [3,-4,1,-2,2,-5]
        excepted output : [3,-2,1,-5,2,-4]

     */
    static void getRearrange(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int i= 0;
        int len = nums.length-1;
        while(i <= len/2){
            swapMethod(nums, i ,len-i);
            i +=2;
        }
        System.out.println(Arrays.toString(nums));
    }

}
