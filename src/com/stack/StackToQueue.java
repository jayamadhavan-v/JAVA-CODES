package com.stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackToQueue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        callConvert(arr);
    }
    public static void callConvert(int[] arr){
        // declaration stack
        Stack<Integer> s= new Stack<>();
        // storing the element into stack
         for (int i : arr){
             s.push(i);
         }
         //declaration queue
        Queue<Integer> q = new LinkedList<>(s);
//         for (int ele : s){
//             q.add(ele);
//         }
        System.out.println(q);
    }
}
