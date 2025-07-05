package com.recursion;

import java.util.Scanner;

public class Print_Sum {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
//        getSum(n,0);
        int sum = getSumS(n);
        System.out.println(sum);

    }
    public static void getSum(int n,int sum){
        if(n<0){
            System.out.println(sum);
            return;
        }
        getSum(n-1,sum+n);

    }
    public static int getSumS(int n){
        if(n ==0){
            return 0;
        }
        return n + getSumS(n-1);
    }
}
