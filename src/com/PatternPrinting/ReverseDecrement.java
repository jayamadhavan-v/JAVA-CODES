package com.PatternPrinting;

public class ReverseDecrement {
    public static void main(String[] args) {
        int n=8;
        for (int i = 0; i < n; i++) {
            for (int j = 5; j <=n-i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
