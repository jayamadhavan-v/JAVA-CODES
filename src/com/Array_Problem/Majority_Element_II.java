package com.Array_Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Majority_Element_II {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1,1, 3, 3, 3, 2, 2, 2};
        // int[] arr = {11, 33, 33, 11, 33, 11};
        getMajority(nums);
    }

    static void getMajority(int[] nums) {

        int n = nums.length; //size of the array
        List<Integer> ls = new ArrayList<>(); // list of answers

        //declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();

        // least occurrence of the majority element:
        int mini = (int) (n / 3) + 1;

        //storing the elements with its occurances
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(nums[i], 0);
            mpp.put(nums[i], value + 1);

            //checking if v[i] is
            // the majority element:
            if (mpp.get(nums[i]) == mini) {
                ls.add(nums[i]);
            }
            if (ls.size() == 2) break;
        }

        System.out.println(ls);
    }


}

