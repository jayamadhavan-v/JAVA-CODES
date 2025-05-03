package com.DSA;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListconcepts {
    public static void main(String[] args) {
        /// syntax of creation of ArrayList
        ArrayList<Integer> myList = new ArrayList<>(4);

        // adding element
        myList.add(67);
        myList.add(673);
        myList.add(673);
        myList.add(675);
        myList.add(677);
        myList.add(678);


//        System.out.println(myList);
//
//        myList.remove(2);
//        System.out.println(myList);

        /// two dimensional Arrays
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        /// intializing the 2d arraylist
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);



    }
}
