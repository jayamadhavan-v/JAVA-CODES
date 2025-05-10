package com.PatternPrinting;

public class pattern_problem_Collection {

    /// pattern 1
    static void pattern1(int n) {
        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /// pattern 2
    static void pattern2(int n) {
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /// pattern 3
    static void pattern3(int n) {
        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /// Pattern 4
    static void pattern4(int n){
        /*
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5

         */
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print( col +" ");
            }
            System.out.println();
        }
    }
    /// Pattern 5
    static void pattern5(int n){
        /*
             *
             * *
             * * *
             * * * *
             * * * * *
             * * * *
             * * *
             * *
             *
         */
        for (int row = 1; row <= 2 * n; row++) {
            /*
            formulae condition
             if row > n
             then n * 2 = it will be greater than row
             if n =5 then 2* 5 = 10
             next 10 -row-->6 means  10-6 = 4 ;
            */

            int r = row <= n ? row : 2 * n -row;

            for (int col = 1; col <= r; col++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
    }
    /// pattern 6
    static void pattern6(int n){
        /*
            _ _ _ _ 1
            _ _ _ 1 2
            _ _ 1 2 3
            _ 1 2 3 4
            1 2 3 4 5

         */
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space < n-row+1; space++) {
                System.out.print("_ ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print( col +" ");
            }
            System.out.println();
        }
    }
    /// pattern 7
    static void pattern7(int n){
        /*

            1 2 3 4 5
            _ 1 2 3 4
            _ _ 1 2 3
            _ _ _ 1 2
            _ _ _ _ 1

         */
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space < row; space++) {
                System.out.print("_ ");
            }
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print( col +" ");
            }
            System.out.println();
        }
    }

    /// pattern 8
    static void pattern8(int n){
        /*
            _ _ _ _ *
            _ _ _ * * *
            _ _ * * * * *
            _ * * * * * * *
            * * * * * * * * *
         */
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space < n-row+1; space++) {
                System.out.print("_ ");
            }
            for (int col = 1; col <= 2 * row-1; col++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
    }

    /// pattern 9
    static void pattern9(int n){
        /*
            * * * * * * * * *
            _ * * * * * * *
            _ _ * * * * *
            _ _ _ * * *
            _ _ _ _ *
         */
        int r = 2 * n;
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space < row ; space++) {
                System.out.print("_ ");
            }
            for (int col = 1; col <= 2 * (n - row)+1; col++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
    }

    /// pattern 10
    static void pattern10(int n){
        /*
            _ _ _ _ *
            _ _ _ * * *
            _ _ * * * * *
            _ * * * * * * *
            * * * * * * * * *
         */
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n-row ; space++) {
                System.out.print("_ ");
            }
            for (int col = 1; col <= 2*row-1; col++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
    }
    /// pattern 11
    static void pattern11(int n){
        /*
            * * * * * * * * *
            _ * * * * * * *
            _ _ * * * * *
            _ _ _ * * *
            _ _ _ _ *
         */
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space < row ; space++) {
                System.out.print("_ ");
            }
            for (int col = 1; col <= 2*(n-row)+1; col++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
    }
    /// pattern 12


    /// Main Function
    public static void main(String[] args) {
        int n = 5;
        pattern11(n);
    }

}
