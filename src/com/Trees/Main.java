package com.Trees;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bs = new BinarySearchTree();
        bs.insert(45);
        bs.insert(56);
        bs.insert(12);
        bs.insert(23);
        bs.insert(45);
        bs.Inorder(bs.root);
    }
}
