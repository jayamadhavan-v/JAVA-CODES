package com.LinkedList;

class Node {
    /// Instances Variables
    int data;
    Node next;

    /// constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    ///  Instances variable
    /// head will carry a First Node Address
    Node head;

    /// Insert At End
    public void insert(int data) {
        // Creating a New Node
        Node newNode = new Node(data);

        if (head == null) { // for First node
            head = newNode;
            return;
        }
        // Not A First Node means we wanna traverse
        // Up to the End Of the List
        // so for Traversal using the {current}

        Node current = head;
        // traversal to Last Node
        while (current.next != null) {
            current = current.next;
            // each time change the address to the current node
        }
        // After that adding the NOde In The Last
        // Adding newNode address into the current.next
        current.next = newNode;

    }

    ///  Insert at the Beginning
    public void insertAtBeginning(int data) {
        //if it is not first then it will execute
        // otherwise it will call the insert
        if (head != null) {
            // Creating a New Node
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            return;
        }
        insert(data);
    }

    ///  Print the List
    public void printList() {
        // for traversal creating a node variable current
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    /// insertInGivenPos
    public void insertInGivenPos(int data, int pos) {
        if (pos == 1) {
            insertAtBeginning(data);
            return;
        }

        // Creating a New Node
        Node newNode = new Node(data);

        //traversal before the given Position
        Node current = head;
        for (int i = 2; i < pos; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;

    }

    public void deleteInFirst() {
        head = head.next;
    }

    public void deleteInLast() {
        Node current = head;
        while(current.next.next != null){
//            System.out.print(current.data);
            current = current.next;
        }
//        System.out.println();
        current.next = null;
    }

    public void deleteInPos(int pos) {
        if(pos == 1){
            deleteInFirst();
            return;
        }
        Node current  = head;
        for (int i = 2; i < pos; i++) {
            current = current.next;
        }
        current.next = current.next.next;
    }
    /// delete all in the LinkedList
    public void deleteAll() {
        head = null;  // This removes reference to the entire list
    }
    public int size(){
        int size = 0;
        if(head==null){
            return size;
        }
        Node current = head;
        while(current != null){
            size++;
            current =current.next;
        }
        return size;
    }
}
