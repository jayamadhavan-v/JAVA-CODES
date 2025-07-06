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
    static void pattern12(int n){
        /*
            _ _ _ _ *
            _ _ _ *   *
            _ _ *   *   *
            _ *   *   *   *
            *   *   *   *   *
         */
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n-row  ; space++) {
                System.out.print("_ ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print( "*   ");
            }
            System.out.println();
        }
    }
    /// pattern 13
    static void pattern13(int n){
            /*
                *   *   *   *   *
                _ *   *   *   *
                _ _ *   *   *
                _ _ _ *   *
                _ _ _ _ *
         */
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space < row  ; space++) {
                System.out.print("_ ");
            }
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print( "*   ");
            }
            System.out.println();
        }
    }
    /// pattern 14
    static void pattern14(int n){
            /*
                *   *   *   *   *
                _ *   *   *   *
                _ _ *   *   *
                _ _ _ *   *
                _ _ _ _ *
                _ _ _ _ *
                _ _ _ *   *
                _ _ *   *   *
                _ *   *   *   *
                *   *   *   *   *
         */
        for (int row = 1; row <= 2 * n; row++) {

            //formula
            int r = row <= n ? n-row+1 : row-n ;

            for (int space = 1; space < n-r+1   ; space++) {
                System.out.print("_ ");
            }
            for (int col = 1; col <= r; col++) {
                System.out.print( "*   ");
            }
            System.out.println();
        }
    }
    /// pattern 15
    static void pattern15(int n){
        /*
            _ _ _ _ *
            _ _ _ *   *
            _ _ *       *
            _ *           *
            *   *   *   *   *
         */
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space < n- row + 1   ; space++) {
                System.out.print("_ ");
            }
            for (int col = 1; col <= row ; col++) {
                if(col == 1 || col == row || row == n ) {
                    System.out.print("*   ");
                }
                else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
    /// pattern 16
    static void pattern16(int n){
        /*
            *   *   *   *   *
            _ *           *
            _ _ *       *
            _ _ _ *   *
            _ _ _ _ *
         */
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space < row ; space++) {
                System.out.print("_ ");
            }
            for (int col = 1; col <= n-row+1 ; col++) {
                if(col == 1 || col == n-row+1|| row == 1 ) {
                    System.out.print("*   ");
                }
                else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
    /// pattern 17
    static void pattern17(int n){
        /*
            _ _ _ _ *
            _ _ _ *   *
            _ _ *       *
            _ *           *
            *               *
            _ *           *
            _ _ *       *
            _ _ _ *   *
            _ _ _ _ *
         */
        for (int row = 1; row < 2 * n; row++) {

            // formula
            int r =  row<= n ? n-row+1: row+1-n ;

            for (int space = 1; space < r ; space++) {
                System.out.print("_ ");
            }
            for (int col = 1; col <= n-r+1; col++) {
                if(col == 1 || col ==  n-r+1) {
                    System.out.print("*   ");
                }
                else {
                    System.out.print("    ");
                }

            }
            System.out.println();
        }
    }
    /// pattern 18 pascal triangle
    static void pattern18(int n){
        /*
                _ _ _ _ 1
                _ _ _ 1  1
                _ _ 1  2  1
                _ 1  3  3  1
                1  4  6  4  1
         */
        int ans =1;
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space < n-row+1; space++) {
                System.out.print("_ ");
            }
            System.out.print(ans + "  ");
            for (int col = 1; col < row ; col++) {
                ans = ans * (row - col) / col ;
                System.out.print(ans+ "  ");
            }
            System.out.println();
        }
    }
    /// pattern 19
    static void pattern19(int n){
        /*
            _ _ _ _ 1
            _ _ _ 2 1 2
            _ _ 3 2 1 2 3
            _ 4 3 2 1 2 3 4
            5 4 3 2 1 2 3 4 5
            _ 4 3 2 1 2 3 4
            _ _ 3 2 1 2 3
            _ _ _ 2 1 2
            _ _ _ _ 1
         */

        for (int row = 1; row< 2*n ;row++){
            int r  =  row <= n ?  n-row+1 : row - n+1 ;
            for (int space = 1; space < r; space++) {
                System.out.print("_ ");
            }
            //formula
            int c = row <= n? row : 2*n-row;
            for (int col = c; col >=1   ; col--) {
                System.out.print(col +" ");
            }
            for (int i = 2; i <= c; i++) {
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
    /// pattern 20
    static void pattern20(int n){
        /*

         */
        for (int row = 1; row < 2 * n; row++) {
            int r  =  row<=n ? n-row : row-n;
            for (int space = 1; space <= r; space++) {
                System.out.print("_ ");
            }
            int c= row<=n ?  row: (2*n)-row ;
            for (int col = 1; col <= 2*c-1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /// pattern 21
    static void pattern21(int n){
        /*
                 * * * * * * * * * *
                 * * * *     * * * *
                 * * *         * * *
                 * *             * *
                 *                 *
                 * *             * *
                 * * *         * * *
                 * * * *     * * * *
                 * * * * * * * * * *

         */
        for (int row = 1; row < 2 * n; row++) {
            int r  =  row<=n ? n-row+1 : (row+1)-n;
            for (int space = 1; space <= r; space++) {
                System.out.print("* ");
            }
            int c= row<n ?  row: (2*n)-row ;
            for (int space= 1; space < 2*c-1; space++) {
                System.out.print("  ");
            }
            int x  =  row<=n ? n-row+1: (row+1)-n;
            for (int space = 1; space <= x; space++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /// pattern 22
    static void pattern22(int n){
        /*
                1 1 1 1 1 1 1 1 1
                1 2 2 2 2 2 2 2 1
                1 2 3 3 3 3 3 2 1
                1 2 3 4 4 4 3 2 1
                1 2 3 4 5 4 3 2 1
                1 2 3 4 4 4 3 2 1
                1 2 3 3 3 3 3 2 1
                1 2 2 2 2 2 2 2 1
                1 1 1 1 1 1 1 1 1
         */
        for (int row = 1; row < 2 * n; row++) {
            for (int col = 1; col < 2 * n; col++) {
                int min = Math.min(Math.min(row,col),Math.min(n*2-row,n*2-col));
                System.out.print(min+ " ");
            }
            System.out.println();
        }

    }

    /// pattern 23
    static void pattern23(int n){
        /*
            4 4 4 4 4 4 4
            4 3 3 3 3 3 4
            4 3 2 2 2 3 4
            4 3 2 1 2 3 4
            4 3 2 2 2 3 4
            4 3 3 3 3 3 4
            4 4 4 4 4 4 4
         */
        int N =  n+1 ;
        for (int row = 1; row < 2 * n; row++) {
            for (int col = 1; col < 2 * n; col++) {
                int min =N-Math.min(Math.min(row,col),Math.min(n*2-row,n*2-col));
                System.out.print(min+ " ");
            }
            System.out.println();
        }

    }
    ///  pattern 24
    static void pattern24(int n){
//        * * * * *
//        *       *
//        *       *
//        *       *
//        * * * * *
        for(int i = 0; i<n ;i++){
            for (int j = 0; j < n; j++) {
                if(i == 0 || j == 0 || i == n-1 || j == n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }



    /// Main Function
    public static void main(String[] args) {
        pattern24(5);
    }
}
