package com.String_Concepts;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // get string
        String entireString = sc.nextLine();
        // storing tht into  String Array

        String[] arr = entireString.split(" ");

        System.out.println(arr.length);

        System.out.println(Arrays.toString(arr));

        palindromeCheck(arr);

        System.out.println("After Check ");

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].isEmpty()) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void palindromeCheck(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String reverse = new StringBuilder(arr[i]).reverse().toString();
            if (arr[i].equals(reverse)) {
                arr[i] = "";
            }
        }
    }
}

