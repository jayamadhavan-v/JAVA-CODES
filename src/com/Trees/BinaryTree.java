package com.Trees;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class BinaryTrees {

    Node root;

    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }


    public static void main(String[] args) {
        BinaryTrees tree = new BinaryTrees();


        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        System.out.print("Inorder: ");
        tree.inorder(tree.root); // 4 2 5 1 3 6

        System.out.print("\nPreorder: ");
        tree.preorder(tree.root); // 1 2 4 5 3 6

        System.out.print("\nPostorder: ");
        tree.postorder(tree.root); // 4 5 2 6 3 1

    }
}
