package com.recursion;

public class reverse_an_number {
    public static void main(String[] args) {
        int n= 234;
        int reverse = getReverse(0,n);
        System.out.println(reverse);
    }

    static int  getReverse(int sum ,int n) {
        //base condition
        if(n == 0){
            return  sum ;
        }
        sum =(sum*10)+(n%10);
        n/=10;
        return getReverse(sum,n);
    }
}
