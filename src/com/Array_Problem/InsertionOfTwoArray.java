package com.Array_Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InsertionOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,9,7,5,3,87,56};
        getInsertion(arr1,arr2);
    }
/// my approach
    static void getInsertion(int[] arr1, int[] arr2) {
        // using to two pointer approach
        HashMap<Integer,Integer> insertion = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            insertion.put(arr1[i],insertion.getOrDefault(arr1[i],0)+1);
        }
        for (int i = 0; i < arr2.length; i++) {
            insertion.put(arr2[i],insertion.getOrDefault(arr2[i],0)+1);
        }
//        for (Integer key : insertion.keySet()) {
//            System.out.println("Key: " + key + ", Value: " +insertion.get(key));
//        }
        List<Integer> myList = new ArrayList<>();
         for (int i : insertion.keySet()){
             if(insertion.get(i) == 1){
                 myList.add(i);
             }
         }
        System.out.println(myList);
    }
}
