package com.DSA_Concepts;

public class SQRT {
    public static void main(String[] args) {
        int x = 64;
//            if (x < 0) {
//                throw new IllegalArgumentException("Input is invalid.");
//            }
//
//            if (x == 0) {
//                return 0;
//            }

        double prev = 0.0;
        double result = 1.0;

        while (prev != result) {
            prev = result;
//                result = (result + x / result) / 2;
            result += x / result;
            result = result / 2;
        }
        if (prev == result) {
            System.out.println((int)prev);
        }
//            return (int)result;

    }
}
