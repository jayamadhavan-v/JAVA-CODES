package com.DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       // System.out.print("Enter the value for n: ");
       // int input = sc.nextInt();
        //System.out.println(toFindFactorial(input));
        System.out.println(kthFactor(7, 3));
    }

    static long  toFindFactorial(long n) {
        if (n==1){
            return 1;
        }
        return n * toFindFactorial(n-1);
    }

    public static int kthFactor(int n, int k) {
//        ArrayList<Integer> myList = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ///myList.add(i);
                k--;
            }
            if(k==0){
                return i;
            }
        }
//        int i=myList.set(3,2);
//        System.out.println(myList);
//        System.out.print(myList.get(k-1));
//        return (k <= myList.size()) ? myList.get(k - 1) : -1;
        return -1;
    }
}
