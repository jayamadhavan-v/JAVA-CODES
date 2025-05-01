package com.oop;

public class Multiple_inheritances {
    public static void main(String[] args) {
        First s1 = new First();
        s1.firstClass();
        Second s2 = new Second();
        s2.secondClass();
        Third s3 = new Third();
        s3.thirdClass();
    }
}

/// First class

class First {
    int n = 5;
    void firstClass(){
        System.out.println("this is a first class");
        System.out.println(n);
    }
}

/// Second class with extend First class

class Second extends First {
    protected int n= 10;
    void secondClass(){
        System.out.println("Second Class");
        System.out.println(super.n);
    }
}

/// Third Class

class Third extends Second {
    void thirdClass(){
        System.out.println("third class");
        System.out.println(n);
    }
}