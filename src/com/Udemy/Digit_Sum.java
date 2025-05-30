package com.Udemy;

public class Digit_Sum {
    public static void main(String[] args) {
        System.out.print(sumDigits(1128));

    }
    public static int sumDigits(int no){
        // n0 --> number;
        int sum = 0;
        if(no<0){
            return -1;
        }
        else {
            while (no > 0) {
                int rem = no % 10;
                sum += rem;
                no /= 10;
            }
        }
        return sum;
    }

}
