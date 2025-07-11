package com.recursion;

public class Count_Zero {
    public static void main(String[] args) {
        int num = 1020304;
        int count = getCount(0,num);
        System.out.println(count);
    }

    static int getCount(int count, int num) {
        //base condition
        if(num == 0){
            return count;
        }
        if(num%10 == 0){
            count++;
        }
        return getCount(count, num/10);
    }
}
