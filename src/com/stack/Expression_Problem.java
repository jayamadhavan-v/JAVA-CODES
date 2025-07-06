package com.stack;

import java.util.Arrays;
import java.util.Scanner;
/// steps in it
///1. get the string from the user
/// 2 . separate the string the character wise
public class Expression_Problem {
    public static void main(String[] args) {
        String n = new Scanner(System.in).nextLine();
        char[] cArr = new char[n.length()];
        for (int i = 0; i < n.length(); i++) {
            cArr[i]=n.charAt(i);
        }
        getExpression(cArr);
        System.out.println(Arrays.toString(cArr));
    }
    public static void getExpression(char arr[]){

    }
}
