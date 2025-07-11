package com.recursion;

public class Sum_Of_digits {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println( getSod(n));
    }

    static int getSod(int n) {
        if(n<=9){
            return n;
        }
        return (n%10) + getSod(n/10);
    }
}
