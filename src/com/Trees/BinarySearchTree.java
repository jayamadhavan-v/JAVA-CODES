package com.Trees;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    /// constructor
    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinarySearchTree {
    TreeNode root;

    /// insert the root into the tree
    public void insert(int data) {
        TreeNode newNode = new TreeNode(data);
        if (root == null) {
            root = newNode;
            return;
        }
        TreeNode current = root;
        // parent is for
        TreeNode parent = null;
        /// find the local to store int value in the tree
        while (current != null) {
            parent = current;
            if (data < current.data) {
                current = current.left;
            } else if (data > current.data) {
                current = current.right;
            } else {
                /// it doesn't allow duplicate into it
                return;
            }
        }
        ///  storing the value into the tree
        if (data < parent.data) {
            parent.left = newNode;
        }
        else {
            parent.right = newNode;
        }
    }
    /// Inorder traversal
    public void Inorder(TreeNode node){
        if (node != null){
            Inorder(node.left);
            System.out.println(node.data);
            Inorder(node.right);
        }
    }

}
