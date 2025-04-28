package com.DSA;

public class GCDorHCF {
    public static void main(String[] args) {
        int gcd = gcd(36,61);
        System.out.println(gcd);
    }
    // Recursive function to return gcd of a and b
    static int gcd(int a, int b)
    {
///     --> Time Complexity  O(log(min(a, b)))
        if (b == 0)
            return a;
        return gcd(b, a % b);

    }
///
}

