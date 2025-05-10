package com.DSA_Concepts;
public class SingleLinkedList {
    public static class Node {
        int data;
        Node next;
         Node(int data ){//constructor
            this.data= data;
            this.next= null;

        }
    }
    public static void main(String[] args) {
        insertion(5);///0
        insertion(10);///1
        insertion(53);///2
        insertion(65);
        //insertionInBeginning(45);
       // insertionInEnd(23);
        insertionInMiddle(67,1);
        display();

    }

    static Node head = null,temp=null;//global deaclaration of the head and the temp

    public static void insertion(int data){
        Node newnode = new Node( data);//creating th new node
        if(head == null){//checks is it any node are there
            head = temp = newnode;
            System.out.println("head accessed");
        }
        else {
            temp.next = newnode;//assigning the newnode into end of the lastnode
            temp= newnode;//storing the node address into the temp for adding the next node
            System.out.println("insertion completed"+ newnode.data);

        }
    }
    static void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print("-->"+temp.data);
            temp = temp.next;;
        }
    }
    static void insertionInBeginning(int data){
        /*
        here head will have the firstnode address so
        step1: store the head address into the newnode;
        step2; store the newnode address into the head;
         */
        Node newnode = new Node(data);
        if(head!=null){
            newnode.next = head;//storing or step1
            head = newnode;//move or step2
            System.out.println("insertion in beginning is completed"+ newnode.data);
        }
        else{
            head = newnode;
            System.out.println("insertion in beginning is completed"+ newnode.data);
        }
    }

    static void insertionInEnd(int data){
        Node newnode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next= newnode;
        System.out.println("insertion in ending is completed"+ newnode.data);
    }

    static void insertionInMiddle(int data ,int pos){
        Node newnode = new Node(data);
        Node temp = head;
        for(int i=0; i<pos;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next= newnode;
        System.out.println("insertion in middle completed  " + newnode.data);
    }




}
