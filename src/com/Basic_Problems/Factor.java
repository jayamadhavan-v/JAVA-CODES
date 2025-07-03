package com.Basic_Problems;
import java.util.*;
public class Factor {
    public static void main(String[] args) {
        factor(28);
    }
    public static void factor(int num){
        ArrayList<Integer> aList  = new ArrayList<>();
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                aList.add(i);
            }
        }
        // convert ArrayList into the Array
//        int[] arr = aList.toArray(new Integer[0]);

    }
}
