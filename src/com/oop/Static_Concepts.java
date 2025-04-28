package com.oop;

public class Static_Concepts {
    public static void main(String[] args) {
//        Obj  funn = new Obj();
//        funn.fun();
//        staticedMethod();



        ///  we can cant use this keyword in the static method
        ///  this keyword is use in only the non-static method or class

    }

    public static void staticedMethod() {
        System.out.println("this is an static method");
    }
}

class Obj {
    public void fun() {
        System.out.println("this an static method");
        greeting();
    }

    public void greeting() {
        System.out.print("this method is an non-static method inside the static method");
    }
}

