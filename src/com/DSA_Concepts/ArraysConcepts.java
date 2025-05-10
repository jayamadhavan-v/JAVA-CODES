package com.DSA_Concepts;

import java.util.*;

public class ArraysConcepts {

    public static void main(String[] args) {
/*
    ///  method to getting a matrix Value from the User
//        Scanner get = new Scanner(System.in);
//        System.out.println("Enter the no of rows : ");
//        int rows = get.nextInt();
//        System.out.println("Enter the no of column : ");
//        int cols = get.nextInt();
//
//        int[][] arr = new int[rows][cols];
//        for (int row = 0; row < rows; row++) {
//            for (int col = 0; col < cols; col++) {
//                arr[row][col] = get.nextInt();
//            }
//        }
        int[] arr1 = {1, 2, 3, 4};

        int[][] arr2 = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };


        /// traditional method
        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                System.out.print(arr2[row][col] + " ");
            }
            System.out.println();

        }
        /// enhanced method
        for (int[] i : arr2) {
            System.out.println(Arrays.toString(i));
        }
        for (int row = 0; row <arr2.length; row++) {
            for (int col = 0; col <arr2.length; col++) {
                System.out.print(arr2[row][col] + " ");
            }
            System.out.println();
        }

 */
        ArraysConcepts s = new ArraysConcepts();
        s.matrixGetValue();
    }

    public void matrixGetValue() {

        // row = 3 ,col = 4 ;

        /// Getting Values From User

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No Of Rows : ");//3
        int rows = sc.nextInt();
        System.out.println("Enter No Of columns : ");//4
        int cols = sc.nextInt();
        System.out.printf("No of Rows : %d  and No OF Cols : %d ", rows, cols);

        /// Initialization for matrix
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = sc.nextInt();
            }

        }
    }
}
