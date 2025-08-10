//package com.Array_Problem;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.ArrayList;
//
///// [leetcode](https://leetcode.com/problems/merge-intervals/description/)
//public class Merge_Intervals {
//    //Merge Overlapping SubInterval
//    public static void filerWriterConcept(String[] args) {
//        int[][] arr = {
//                {1, 3},
//                {2,6},
//                {8, 10},
//                {2, 6},
//                {15, 18}
//        };
//        List<List<Integer>> ans = mergeOverlappingIntervals(arr);
//    }
//
//    static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
//        List<List<Integer>> myList = new ArrayList<>();
//        // Sort the Array for FInd the Interval
//        Arrays.sort(arr);
//        //
//
//        for(int i=0; i<arr.length;i++){
//            int start =arr[i][0];
//            int end = arr[i][1];
//
//                if (arr[i][n]<arr[i+1][0]) {
//                    end = arr[i + 1][0];
//                }
//            }
//            myList.add(Arrays.asList(start, end));
//
//        }
//
//        return myList;
//    }
//}
