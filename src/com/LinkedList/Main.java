package com.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insertAtBeginning(1);
        ll.printList();
        ll.insertInGivenPos(0,1);
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
