package com.recursion;

/// Number of Steps to Reduce a Number to Zero
/// [...](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/)
public class count_Steps {
    public static void main(String[] args) {
        int n = 14;
        int steps = numberOfSteps(n);
        System.out.println(steps);
    }

    static int numberOfSteps(int n) {
        return helper(0, n);
    }

    static int helper(int steps, int n) {
        //base condition
        if (n == 0) {
            return steps;
        }
        if (n % 2 == 0) {
            n = n / 2;
        } else {
            n = n - 1;
        }
        steps++;
        return helper(steps, n);
    }
}
