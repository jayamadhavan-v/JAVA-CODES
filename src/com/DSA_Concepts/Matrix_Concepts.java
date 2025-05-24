package com.DSA_Concepts;
///     to Use The Array Built In Method Import Arrays

import java.util.Arrays;


public class Matrix_Concepts {
    public static void main(String[] args) {
        int[][] matArr2 = {
                {11,12,13,14},
                {21,22,23,24},
                {31,32,33,34},
                {41,42,43,44}
        };
        int[][] matArr1 = {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}};
        int[][] resArr =
//                additionMatrix(matArr1,matArr2);
//                subtraction(matArr1,matArr2);
//                multiplication(matArr1,matArr2);
//                division(matArr1,matArr2);
//        transposeMatrix(matArr2);
        reverseMatrix(matArr2);


        ///     deepToString method will print the  entire matrix in single Line
//        System.out.println(Arrays.deepToString(matArr1));

        ///      to print the array in matrix use this for format
        for (int[] row :resArr) {
            System.out.println(Arrays.toString(row));
        }
    }


    ///  Addition for 2D matrix
    static int[][] additionMatrix(int[][] mat1,int[][] mat2 ){
        int[][] res = new int[mat1.length][mat1[0].length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                res[i][j] = mat1[i][j]+ mat2[i][j];
            }
        }
        return res;
    }
/// Subtraction of 2D Matrix
    static int[][] subtraction(int[][] mat1,int[][] mat2 ){
        int[][] res = new int[mat1.length][mat1[0].length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                res[i][j] = mat1[i][j]- mat2[i][j];
            }
        }
        return res;
    }
/// multiplication  of 2D Matrix
    static int[][] multiplication(int[][] mat1,int[][] mat2){
        int[][] res = new int[mat1.length][mat1[0].length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                res[i][j] = mat1[i][j] * mat2[i][j];
            }
        }
        return res;
    }
/// Division  of 2D Matrix
    static int[][] division(int[][] mat1,int[][] mat2){
        int[][] res = new int[mat1.length][mat1[0].length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                res[i][j] = mat2[i][j] % mat1[i][j];
            }
        }
        return res;
    }
/// Transportation of 2D Matrix
    static int[][] transposeMatrix(int[][] mat) {
        int len = mat.length;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i+1; j++) {
                int dummy = mat[i][j];
                mat[i][j]= mat[j][i];
                mat[j][i] = dummy;
            }
        }
        return mat;
    }
/// Reverse of  the  2D Matrix
    static int[][] reverseMatrix(int[][] mat){
        int len = mat.length-1;
        int len2= mat[0].length-1;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length/2; j++) {
                 int dummy  = mat[i][j];
                mat[i][j] =  mat[i][len-j] ;
                mat[i][len-j] = dummy;
            }
        }
        return mat;
    }
}
