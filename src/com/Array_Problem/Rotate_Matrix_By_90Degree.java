package com.Array_Problem;

import java.util.Arrays;

public class Rotate_Matrix_By_90Degree {
    public static void main(String[] args){
        int[][] mat= {{1, 2, 3,11}, {4, 5, 6,22}, {7, 8, 9,33},{11,22,33,44}};
        doRotation(mat);
    }

    static void doRotation(int[][] mat) {
        int[][] rotate = new int[mat.length][mat[0].length];
        int len= mat.length;
        int s =len-1,k=0;
        for(int i =0 ; i < len ;i++){
            for (int j = 0; j < len; j++) {
                rotate[i][j] = mat[s][k];
                s--;
            }
            k++;
            s=len-1;
        }
        for (int[] i: rotate){
            System.out.println(Arrays.toString(i));
        }
    }
}
