package com.DSA_Concepts; ///     to Use The Array Built In Method Import Arrays

import java.util.Arrays;

public class MatrixConcepts {
    public static void main(String[] args) {

        int[][] matrixArray2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] matrixArray1 = {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}};

        int[][] additionMatrix = new int[matrixArray1.length][];

        for (int i = 0; i < matrixArray1.length; i++) {

            for (int j = 0; j < matrixArray1.length; j++) {

                additionMatrix[i][j] = matrixArray1[i][j] + matrixArray2[i][j];
            }
        }
    ///     deepToString method will print the  entire matrix in single Line

        System.out.println(Arrays.deepToString(additionMatrix));
///      to print the array in matrix use this for format
        for (int[] row : additionMatrix) {
            System.out.println(Arrays.toString(row));
        }

    }
}
