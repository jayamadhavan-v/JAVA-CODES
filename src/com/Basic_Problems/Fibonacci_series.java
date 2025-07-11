package com.Basic_Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci_series {
    public static void main(String[] args) {
        int n = 5;
        Integer[] fiboArr = getFibo(n);
        System.out.println(Arrays.toString(fiboArr));
    }

    static Integer[] getFibo(int n) {
        ArrayList<Integer> arr = new ArrayList<>();

        int i = 0, a = 0, b = 1;

        while (i <= n) {
            arr.add(a);
            int next = a + b;
            a = b;
            b = next;
            i++;
        }


        return arr.toArray(new Integer[0]);
    }
}
