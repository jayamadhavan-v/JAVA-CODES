package com.DSA;

import java.util.Scanner;

class ReverseAnNumber {
    public static void main(String[] args) {
///  Reverse a number problem
        System.out.print("Enter a Number To Reverse : ");
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        long reversedInput = reverseIt(input);
        long count = findCount(input);
        System.out.println("reversed Number : " + reversedInput);
        System.out.println("count of the numbers : " + count);
    }

    public static long reverseIt(long n) {
        long reversedNumber = 0;
        while (n > 0) {
            long lastDigit = n % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            n /= 10;
        }
        return reversedNumber;
    }

    public static long findCount(long n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}

