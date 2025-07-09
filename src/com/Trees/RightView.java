package com.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


//class TreeNode {
//    char val;
//    TreeNode left;
//    TreeNode right;
//
//    public TreeNode(char val) {
//        this.val = val;
//        this.left = null;
//        this.right = null;
//    }
//}

public class RightView {
    public static List<Character> rightView(TreeNode root) {
        List<Character> rightView = new ArrayList<>();
        if (root == null) return rightView;

        Queue<TreeNode> queue = new LinkedList<>(); // Make sure this is java.util.LinkedList
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (i == levelSize - 1) {
//                    rightView.add(node.val);
                }
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }

        return rightView;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode('A');
        root.left = new TreeNode('B');
        root.right = new TreeNode('C');
        root.left.left = new TreeNode('D');
        root.left.right = new TreeNode('E');
        root.right.left = new TreeNode('F');
        root.right.right = new TreeNode('G');

        List<Character> result = rightView(root);
        System.out.print("Right View: ");
        for (char c : result) {
            System.out.print(c + " ");
        }
    }
}
