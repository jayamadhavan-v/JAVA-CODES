package com.recursion;

import java.util.*;

public class Print_Linearly_From_1_TO_N {
    public static void main(String[] args) {
        int n =new Scanner(System.in).nextInt();
        print1(1,n);
    }
    public static void print1(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        i++;
        print1(i,n);

    }
}
