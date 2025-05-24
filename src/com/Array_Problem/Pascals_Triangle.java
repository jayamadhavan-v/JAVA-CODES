package com.Array_Problem;

import java.util.ArrayList;

/// [...](https://leetcode.com/problems/pascals-triangle/description/)
/// 06/may/2025
public class Pascals_Triangle {
    public static void main(String[] args) {

       Solution2 s = new Solution2();
            // [...](https://leetcode.com/problems/pascals-triangle/description/)
//        ArrayList<ArrayList<Integer>> myList = s.printIt(5);
//        ArrayList<Integer> myList = s.getRow(5);
//        System.out.println(myList);

            //        [...](https://leetcode.com/problems/pascals-triangle-ii/description/)

        printingPascal(5);
        getPattern(5);

    }
    public static void getPattern(int n){
        // row
        for (int row = 1 ; row < n ; row++){
            int res = 1;
            System.out.print(res+" ");
            for (int i = 1; i < row; i++) {
                res = res * (row - i) / (i);
                System.out.print(res+ " ");
            }
            System.out.println();
        }
    }
    public static void printingPascal(int n) {

        for (int row = 1; row < n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(ncr(row-1,col-1));
            }
            System.out.println();
        }

    }

    public static int ncr(int n, int c) {
        int result = 1;
        for (int i = 0; i < c; i++) {
            result = result * (n - i);
            result = result / (i + 1);
        }
        return result;
    }
}

class Solution1 {

//    --> Printing Entire Array

    public ArrayList<ArrayList<Integer>> printIt(int rowNumber) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int row = 1; row <= rowNumber; row++) {
            list.add(NCR_Method(row));
        }
        return list;
    }

//  --> NCR_Method

    public ArrayList<Integer> NCR_Method(int row) {
        ArrayList<Integer> arr = new ArrayList<>();
        int ans = 1;
        arr.add(ans);
        for (int i = 1; i < row; i++) { // I Want to start with 1 otherwise it will give error in line 16
            ans = ans * (row - i) / (i);
            arr.add(ans);
        }
        return arr;
    }

//   --> for a single row matrix

    public  ArrayList<Integer> getRow(int n) {

        ArrayList<Integer> arr = new ArrayList<>();
        long ans = 1;
        arr.add((int) ans);
        for (int i = 1; i < n; i++) { //
            ans = ans * (n - i );
            ans = ans / i;
            arr.add((int) ans);
        }
        return arr;
    }


}
