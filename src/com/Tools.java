package com;

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
    public static void swapMethod(int[] arr, int first, int second){
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
    public static int getMaxIndex(int[] arr,int len){
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        if (len == 0) {
            return 0;
        }
        for (int i = 0; i <= len; i++) {
            if(max<arr[i]){
                max =arr[i];
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}
