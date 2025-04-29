package com.NormalPractices;

public class divisible {
    public static void main(String[] args) {
        int sum =0,start = 1,end =5;
        while(start<=end){
            if(start % 2 ==0){
                sum += start;
            }
            start++;
        }
        System.out.println(sum);
    }
}
