package com.PatternPrinting;

public class InnerDiamond {
    public static void main(String[] args) {
        int n = 6;
//        First part
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("* ");
            }
            for (int space = 0; space < row * 2; space++) {
                System.out.print("  ");
            }
            for (int col1 = n; col1 - row > 0; col1--) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        Second part
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            for (int space = 0; space < (n*2) - (row)*2; space++) {
                System.out.print("  ");
            }
            for (int clo2 = 0; clo2 < row; clo2++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}

