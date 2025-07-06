package com.training_session;

import java.util.*;

public class Tables {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printTables(a,b);
    }

    static void printTables(int len, int table) {
        for (int i = 1; i <=len; i++) {
            System.out.printf("%d X %d = %d",i, table, i*table);
            System.out.println();
        }
    }
}
