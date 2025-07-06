package com.LinkedList.problems;

import com.LinkedList.LinkedList;

public class Reverse_a_LInked_List {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            ll.insert(i);
        }
        ll.printList();

    }
}
