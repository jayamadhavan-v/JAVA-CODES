package com.DSA;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a value of n: ");
//        int input = sc.nextInt();
          int input = 50;
        System.out.println(recursionFibo(input));

//        int fibo =normalMethod(input);
//        System.out.println(fibo);
    }

    public static int normalMethod(int n) {
        if(n<2){
            return n;
        }
        int i = 2,a = 0,b = 1;
        while(i <= n){
            int temp = a + b;
            a=b;
            b=temp;
            i++;
        }

        return b;
    }

    static int recursionFibo(int n) {
        // base Condition
        if (n < 2) {
            return n;
        }
        return recursionFibo(n - 1) + recursionFibo(n - 2);
    }
}
