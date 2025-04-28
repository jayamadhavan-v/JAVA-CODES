package com.NormalPractices;

import java.util.Arrays;

public class SetMatrixZeroes {
    ///     -->LeetCode Problem No 73

    public static void main(String[] args) {

        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
                //{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
            /*
            --> Question is If The Matrix Contain Zero  In It Then Changes The Row and Column Wanna Be Zero

            1   1   1           1   0   1
            1   0   1   ==>     0   0   0
            1   1   1           1   0   1

           */
        int[][] result = new int[matrix.length][];

        BruteForce bf = new BruteForce();

//        result = bf.getBruteForce(matrix, matrix.length);

        BetterSolution bs = new BetterSolution();

        result = bs.getBetterSolution(matrix);

        ///     --> using built;-in method to print the print matrix array so import the arrays

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}

class BruteForce {
    public int[][] getBruteForce(int[][] matrix, int len) {

        ///  Time Complexity O(n3 n cube) and Space Complexity will same as O(1)

        for (int row = 0; row < len; row++) {
            for (int col = 0; col < len; col++) {
                if (matrix[row][col] == 0) {
                    changeRow(matrix, row);
                    changeCol(matrix, col);
                }
            }
        }
        changeIntoZero(matrix);
        return matrix;
    }

    public static int[][] changeIntoZero(int[][] matrix) {
        int len = matrix.length;
        for (int row = 0; row < len; row++) {
            for (int col = 0; col < len; col++) {
                if (matrix[row][col] == -1) {
                    matrix[row][col] = 0;
                }
            }
        }
        return matrix;
    }


    public static int[][] changeCol(int[][] matrix, int col) {
        for (int row = 0; row < matrix.length; row++) {

            if (matrix[row][col] != 0) {
                matrix[row][col] = -1;
            }
        }
        return matrix;
    }

    public static int[][] changeRow(int[][] matrix, int row) {
        for (int col = 0; col < matrix.length; col++) {

            if (matrix[row][col] != 0) {
                matrix[row][col] = -1;
            }
        }
        return matrix;
    }
}

class BetterSolution {
    public int[][] getBetterSolution(int[][] matrix) {
        ///     Time Complexity For it O(n) Space Complexity for it O(1) + O(rows + Cols)
        ///     extra space were took for it
        int[] rows = new int[matrix.length];
        int[] cols = new int[matrix[0].length];//-->

///     to find the which row and column have contains 0 and mark it as 1 in the above arrays

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < cols.length; col++) {//-->
                if (matrix[row][col] == 0) {
                    rows[row] = 1;
                    cols[col] = 1;
                }
            }
        }

///     traversal the rows and cols array based oon the change the matrix 2 d array

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) { //-->
                if (rows[i] == 1 || cols[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }


        return matrix;
    }
}
