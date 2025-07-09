package com.LinkedList.problems;


public class LoopDetection {
    public static void main(String[] args) {
        LinkedListWithLoop ll = new LinkedListWithLoop();
        int n = 5;

        for(int i =1 ;i<=n ;i++){
            ll.add(i);
        }
//        ll.createLoop(3,3);
        boolean pos = ll.isLoop(0);
        System.out.println(pos);
    }
}
class Node{
    /// Instances Variables
    int data;
    Node next;

    /// constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedListWithLoop {
    Node head;

    // Add new node at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public boolean isLoop(int i) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }
        return false;
    }
    public void createLoop(int data , int pos){
        if (head == null) return;
        add(data);
        Node loopNode = head;
        for (int i = 1; i < pos; i++) {
            loopNode = loopNode.next;
        }

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        // Make the last node point to the loopNode
        tail.next = loopNode;
    }
}