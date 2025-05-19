package com.Array_Problem;

import java.util.HashMap;
import java.util.Map;
/// [....](https://leetcode.com/problems/majority-element/description/)
public class MajorityOfTheNumberInArray {
    public static void main(String[] args) {
        int[] nums = {2, 2,  2, 2,3, 3, 1,1,1,1};

        getMajorityNO(nums);

        // better Solution moore Voting Algorithm

        int n = getMajorityNO1(nums);
        System.out.println(n);
    }
///  optimal Solution tc O(n)
    static int  getMajorityNO1(int[] nums) {
        int cnt  = 0;
        int el = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(cnt == 0){
                cnt ++;
                el = nums[i];
            } else if (nums[i] == el) {
                   cnt++;
            }
            else{
                cnt--;
            }
        }
        return el;
    }

    static void getMajorityNO(int[] nums) {
        // using HashMap Tc = O(n log n)
        HashMap<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // Increment the count if key exists, else put 1
            myMap.put(nums[i], myMap.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer,Integer> entry : myMap.entrySet()) {
            if(entry.getValue()> nums.length/2){
                System.out.println(entry.getKey());
            }


        }
        System.out.println("no");
    }

}

