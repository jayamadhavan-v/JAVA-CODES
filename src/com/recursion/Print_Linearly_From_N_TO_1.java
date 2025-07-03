package com.recursion;

import java.util.*;
public class Print_Linearly_From_N_TO_1 {
    public static void main(String [] args){
        int n = new Scanner(System.in).nextInt();
        print1(0,n);
    }
    public static void print1(int i,int n){
        if(i>=n){
            return;
        }
        i++;
        print1(i,n);
        System.out.println(i);
    }
}
