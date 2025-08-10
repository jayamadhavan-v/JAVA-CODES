package com.Trees;

import java.util.ArrayList;

public class Expression_Insertion {
    public static void main(String[] args) {
        TreeNodes root = new TreeNodes('+');
        root.left = new TreeNodes('-');
        root.right = new TreeNodes('8');
        root.left.left = new TreeNodes('*');
        root.left.right = new TreeNodes('4');
        root.right.left = new TreeNodes('3');
        root.right.right = new TreeNodes('5');
        BinaryTree bst = new BinaryTree();
//        bst.inorder(root);
        bst.evaluation(root);
    }
}

class TreeNodes {
    char data;
    TreeNodes left;
    TreeNodes right;

    /// constructor
    TreeNodes(char data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTree {

    public void inorder(TreeNodes root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);  // Fixed right subtree call
        }
    }

    public void evaluation(TreeNodes root) {
        StringBuilder sb = new StringBuilder();
        ///  adding char into the string
        if (root != null) {
            inorder(root.left);
            sb.append(root.data);
            inorder(root.right);
        }

    }
}
/*
class Node3 {
    char data;
    Node3 left, right;

    Node3(char value) {
        data = value;
        left = right = null;
    }
}

public class InOrder{
    Node3 root;
    StringBuilder sb = new StringBuilder();

    public void inOrderTravesal(Node3 node){
        if(node != null){
            inOrderTravesal(node.left);
            sb.append(node.data);
            inOrderTravesal(node.right);
        }
    }

    public static int evaluator(StringBuilder expr) {
        int temp = 0;
        int len = expr.length();

        temp = Character.getNumericValue(expr.charAt(0));

        for (int i = 1; i < len - 1; i += 2) {
            char operator = expr.charAt(i);
            int nextOperand = Character.getNumericValue(expr.charAt(i + 1));

            if (operator == '+') {
                temp = temp + nextOperand;
            } else if (operator == '-') {
                temp = temp - nextOperand;
            } else if (operator == '*') {
                temp = temp * nextOperand;
            } else if (operator == '/') {
                temp = temp / nextOperand;
            }
        }

        return temp;
    }

    public static void filerWriterConcept(String[] args) {
        InOrder tree = new InOrder();

        // root
        tree.root = new Node3('-');

        // left
        tree.root.left = new Node3('*');
        tree.root.left.left = new Node3('3');
        tree.root.left.right = new Node3('5');

        // right
        tree.root.right = new Node3('+');
        tree.root.right.left = new Node3('4');
        tree.root.right.right = new Node3('8');

        tree.inOrderTravesal(tree.root);
        StringBuilder out = new StringBuilder(tree.sb.toString());

        System.out.println("Infix Expression: " + out.toString()); // optional, for debugging
        int result = evaluator(out);
        System.out.println("Evaluated Result: " + result);
    }

}
 */