package com.recursion;

public class factorial{
    public static void main(String[] args) {
        int n = 5; /// n!
        System.out.println(getFactorial(n));
    }
    static int getFactorial(int n){
        //base condition
        if(n<=1){
            return 1;
        }
        return n * getFactorial(n-1);
    }
}
