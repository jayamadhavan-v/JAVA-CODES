package com.recursion;
import java.util.*;

public class N_Queens {

    public static void display(int N , char[][] board) {
        for(int row = 0 ; row < N ; row++) {
            for(int col = 0 ; col < N ; col++) {
                System.out.print(board[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isSafe(int N , char[][] board, int row , int col) {
        int r = 0;
        int c = 0;

        // Check same column
        c = col;
        for(r = row-1 ; r >= 0 ; r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        ///  check already queen is there or not
        for(r = row , c = col ; r >= 0 && c >= 0 ; r-- , c--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for(r = row , c = col ; r >= 0 && c < N ; r-- , c++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void Solve(int N , char[][] board, int row) {
        if(row == N) {
            display(N, board);
        } else {
            for(int col = 0 ; col < N ; col++) {
                if(isSafe(N , board , row , col)) {
                    board[row][col] = 'Q';       // place queen
                    Solve(N , board , row+1);    // recursive call
                    board[row][col] = '-';       // backtrack
                }
            }
        }
    }

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        int N = //input.nextInt();
        4;
        char[][] board = new char[N][N];
        for(int ind = 0 ; ind < N ; ind++) {
            Arrays.fill(board[ind], '-');
        }
        Solve(N , board , 0);
//        input.close();
    }
}
