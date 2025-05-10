package com.DSA_Concepts;
import java.util.Arrays;

public class Removeduplicate {
    public static void main(String[] args) {
        int[] myArr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = 0, j;
        for (j = 1; j < myArr.length; j++) {
            while (myArr[i] != myArr[j]) {
                i++;
                myArr[i] = myArr[j];
            }
        }
        System.out.print(Arrays.toString(myArr));
    }
}
