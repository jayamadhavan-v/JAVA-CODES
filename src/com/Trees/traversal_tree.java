package com.Trees;


public class traversal_tree {
    ///  inorder
    public void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.left);
        }
    }

}
