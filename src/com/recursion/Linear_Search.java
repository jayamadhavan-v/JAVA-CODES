package com.recursion;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {0,8,7,6,5,4,3,2,1};
        int target = 1;
        boolean a = isTargetHere(arr,0,target);
        System.out.println(a);
    }

    static boolean isTargetHere(int[] arr, int i, int target) {
        //base condition
        if(target == arr[i]){
            return true;
        }
        if(i == arr.length-1){
            return false;
        }
        else {
            return isTargetHere(arr, i+1, target);
        }

    }
}
