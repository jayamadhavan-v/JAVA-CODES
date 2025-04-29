package com.oop;

public class StaticBlock {
    static int a = 4;
    static int b;
    static  int c  = 3;

    static {

        System.out.println("this is an Static block");
        System.out.println(b);
        b = a * 5;
    }

    public static void main(String[] args) {
//        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        System.out.println();
        b+=3;
        System.out.println(StaticBlock.b);
    }
}
