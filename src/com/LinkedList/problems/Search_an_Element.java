package com.LinkedList.problems;


import com.LinkedList.LinkedList;

public class Search_an_Element {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        int n = 25;

        for(int i =0 ;i<=n ;i++){
            ll.insert(i);
        }
        boolean pos = ll.getElement(0);
        System.out.println(pos);
    }
}
