package com.training_session;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name  = sc.next();
        int age = sc.nextInt();
        double cgpa = sc.nextDouble();
        System.out.println("NAME : "+name);
        System.out.println("AGE : "+age);
        System.out.println("CGPA : "+cgpa);
    }
}
