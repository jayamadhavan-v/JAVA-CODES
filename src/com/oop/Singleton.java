package com.oop;

public class Singleton {

    private static Singleton instance;
    // 1. static instance


    private Singleton() {
        // 2. private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // 3. create only once
        }
        System.out.println(instance);
        return instance;

    }
}


