package com.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Character> ll = new LinkedList<>();
        ll.insert('c');
        ll.insert('f');
        ll.insert('t');
        ll.insert('r');
        ll.insertAtBeginning('t');
        ll.printList();
        ll.insertInGivenPos('p',1);
//        ll.printList();
//        ll.deleteInFirst();
        ll.printList();
//        ll.deleteInLast();
//        ll.printList();
//       ll.deleteInPos(5);
        ll.printList();
        System.out.println( ll.size());
//        ll.deleteAll();
        ll.printList();
    }
}
