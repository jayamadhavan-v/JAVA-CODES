package com.Array_Problem;

import java.util.Arrays;
import java.util.Scanner;

 ///[...](https://leetcode.com/problems/set-matrix-zeroes/description/)
/// 05/may/2025
public class Set_Matrix_Zero {
    public static void main(String[] args) {
        Set_Matrix_Zero r = new Set_Matrix_Zero();
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
                //r.matrixGetValue();
        Solution m = new Solution();
//        m.optimalSolution(matrix);
        m.betterSolution(matrix);
    }
    public int[][] matrixGetValue() {

        // row = 3 ,col = 4 ;

        /// Getting Values From User

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No Of Rows : ");//3
        int rows = sc.nextInt();
        System.out.print("Enter No Of columns : ");//4
        int cols = sc.nextInt();
        System.out.printf("No of Rows : %d  and No OF Cols : %d ", rows, cols);
        System.out.println();

        /// Initialization for matrix
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.println("Enter the  row "+row+1 +" : ");
                matrix[row][col] = sc.nextInt();
            }
            System.out.println();

        }
        return matrix;
    }
}
/// Optimal Solution

class Solution {
    public int[][] optimalSolution(int[][] matrix ){
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Step 1: Check if first row and first column have zeroes
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Step 2: Use first row and column as markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 3: Set cells to zero based on markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 4: Zero out first row if needed
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 5: Zero out first column if needed
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
        return matrix;
    }


 /// Better Solution TimeComplexity --> O(n)
 ///
    public void betterSolution(int[][] mat) {
        int[] rowArr = new int[mat.length];
        ///in case row and col are not for that
        int[] colArr = new int[mat[0].length];
///  ---> to find the zero and mark in array
        for (int i = 0; i < mat.length; i++) { ///control row
            for (int j = 0; j < mat.length; j++) { /// control column
                if (mat[i][j] == 0) {
                    rowArr[i] = 1;
                    colArr[j] = 1;
                }
            }
        }
///  ---> covert the row and col into zero
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(rowArr[i]== 1 || colArr[j] == 1){
                    mat[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(mat));

    }
}
