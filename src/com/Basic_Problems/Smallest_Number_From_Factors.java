package com.Basic_Problems;

import java.util.*;
///If a is 0 → output 10 (since 1×0 = 0).
///
/// If a is 1 → output 11 (to ensure more than one digit).
///
/// Try to factor a using digits from 9 down to 2.
///
/// If not completely factored, return "Invalid".
///
/// Sort the collected digits in ascending order to make the smallest number.
///
/// Print the number formed by those digits.


public class  Smallest_Number_From_Factors {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        // special case for 0 and 1

        if(num == 0){ // 1 * 0 = 10
            System.out.println("10");
        }
        if (num == 1) { // 1 * 1 = 11
            System.out.println("11");
        }

        // using the list
        List<Integer> digits = new ArrayList<>();

        for (int i=9; i>=2; i--) { // reverse order for getting new quotient
            if(num % i == 0){
               digits.add(i);
               num/=i; // quotient will be new divisor
            }
        }
        if(num!=1){ // in final num will become 1 otherwise invalid
            System.out.println("Invalid");
        }
        Collections.sort(digits); // sorting
        System.out.println(digits);
    }
}
