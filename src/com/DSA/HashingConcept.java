package com.DSA;
import java.util.Arrays;

public class HashingConcept {
    public static void main(String[] args) {
        int [] arr = {1,2,3,12,4,7,3,2,1};
        removeDuplicateFromArr(arr);

        /// ASCII values (AMERICAN STANDARD CODE FOR INFORMATION INTERCHANGE )
        /*
        A-Z (65 to 90)
        a-z (97 to 122)

         */
        String myString = "jayamadhavan";


    }

    static void removeDuplicateFromArr(int[] arr) {
        int len = arr.length;
        System.out.println(Arrays.toString(arr));
        ///  to find the max
        int maxValue = maxvalue(arr);

        // create a hash array

        int[] hashArr = new int[maxValue+1];
        int i=0;
        while(i<len){
            hashArr[arr[i]]++;
            i++;
        }
        System.out.println(Arrays.toString(hashArr));
        int index=0;
        while(index< hashArr.length){
            if(hashArr[index]>1){
                System.out.print(index + " ");
            }
            index++;
        }
    }

    static int maxvalue(int[] arr) {
        int len  = arr.length;
        int i=0;
        int max = Integer.MIN_VALUE;
        while(i < len){
            if(arr[i]>max){
                max= arr[i];
            }
            i++;
        }
        return max;
    }


}
