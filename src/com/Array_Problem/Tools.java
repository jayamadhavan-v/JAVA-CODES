package com.Array_Problem;

public class Tools {
    int[] arr;
    int first;
    int second ;


    Tools(int[] arr) {
        this.arr = arr;
    }
    Tools(int []arr,int first,int second){
        super();
        this.first = first;
        this.second = second;
    }
    public static int getMax(int[] arr){
        int max = Integer.MIN_VALUE;
        if (arr.length == 0) {
            return 0;
        }
        for (int i : arr){
            max = Math.max(max,i);
        }
        return max;
    }
    static void swapMethod(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }
    public static int getMin(int[] arr){
        int min = Integer.MAX_VALUE;
        if (arr.length == 0) {
            return 0;
        }
        for (int i : arr){
            min = Math.min(min,i);
        }
        return min;
    }
}
