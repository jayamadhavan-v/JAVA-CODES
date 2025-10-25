package com.PlacementProblem;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,3,2,8,1,4};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if(arr[i] % 2 != 0 && arr[j] % 2 != 0 && arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] % 2 == 0 && arr[j] % 2 == 0 && arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(var i : arr) System.out.print(i + " ");
    }
}
