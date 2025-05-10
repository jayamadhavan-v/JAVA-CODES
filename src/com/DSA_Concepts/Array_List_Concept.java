package com.DSA_Concepts;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List_Concept {
    public static void main(String[] args) {

/// syntax of creation of ArrayList
        ArrayList<Character> myList = new ArrayList<>();

        // adding element
//        myList.add(67);
//        myList.add(673);
//        myList.add(673);
//        myList.add(675);
//        myList.add(677);
//        myList.add(678);
        myList.add('c');



        System.out.println(myList);

//        myList.remove(2);
        System.out.println(myList);

/// Two dimension Arrays


        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        /// Initialize  the 2d arraylist
        for (int i = 0; i < 3; i++) {
        // to array new array into the overall Array
            list.add(new ArrayList<>());

        }
        for (int i = 0; i < 3; i++) { // for  no of Array
            for (int j = 0; j < 3; j++) { // for no of elements
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);





    }
}
