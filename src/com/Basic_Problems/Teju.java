package com.Basic_Problems;

class Teju {
    public static void main(String[] args) {
        int [] arr ={3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] arr) {
        int len = arr.length;
        int i = 0;

        while (i < len) {
            int index = arr[i] - 1;
            if (index >= 0 && index < len && arr[i] != arr[index]) {
                swapMethod(arr, i, index);
            } else {
                i++;
            }
        }

        for (int index = 0; index < len; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        return len + 1;
    }

    static void swapMethod(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    /*
    jayamadhavan v from velammal institute of technology in panchetti
    
     */
}
