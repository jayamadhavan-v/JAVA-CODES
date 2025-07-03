package com.recursion;

import java.util.*;

public class Print_Name_N_Times {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        /// time complexity is O(n)
        printNtimes1(n);
        printNtimes2(1, n);
    }

    // my approach
    public static void printNtimes1(int n) {
        if (n == 0) {
            return;
        }
        n--;
        printNtimes1(n);
        System.out.println("madhavan-" + n);
    }

    // striver approach
    public static void printNtimes2(int i, int n) {
        if (i > n) {
            return;
        }

        System.out.println("madhavan-" + i);
        i++;
        printNtimes2(i, n);
    }
}
