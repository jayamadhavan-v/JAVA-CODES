package com.Array_Problem;

import java.util.ArrayList;

public class Spiral_matrix {

    public static void main(String[] args) {
        int[][] mat = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}
        };
        getSpiralMatrix(mat);
    }

    public static void getSpiralMatrix(int[][] mat) {
        // sliding window
        int left = 0, right = mat[0].length-1, top = 0, bottom = mat.length-1;
        ArrayList<Integer> myList = new ArrayList<>();
        while (left <= right && top <= bottom){

            for (int i = left; i <= right; i++) { ///  it will go left to right
                myList.add(mat[left][i]);
            }
            ///  first row completed so moving into second row
            top++;
            for (int i = top; i <= bottom; i++) {
               myList.add(mat[i][right]);
            }
            right--;
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    myList.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    myList.add(mat[i][left]);
                }
                left++;
            }
        }
        System.out.println(myList);
    }
}
