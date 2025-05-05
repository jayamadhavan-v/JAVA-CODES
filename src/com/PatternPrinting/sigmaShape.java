package com.PatternPrinting;

public class sigmaShape {
    public static void main(String[] args) {
        sigmaShapePattern(5);
        /*
         ****\n
         ***\n
         **\n
         *\n
         **\n
         ***\n
         ****\n
         */
    }

    static void sigmaShapePattern(int len) {
        for (int i = 0; i < len; i++) {
            for (int j = len-i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

