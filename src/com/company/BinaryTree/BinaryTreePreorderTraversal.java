package com.company.BinaryTree;

import java.util.*;

class Solution {
    public static void main(String[] args){
        TreeNode node = new TreeNode();
        node.val = 1;
        node.right = new TreeNode(2,null,null);
        System.out.println(preorderTraversal(node).toString());
    }

    public static List <Integer> preorderTraversal(TreeNode root) {
        List <Integer> list = new ArrayList <> ();
        goUntilNull(root, list);
        return list;
    }

    public static void goUntilNull(TreeNode root, List <Integer> list) {
        if (root != null) {
            list.add(root.val);
            if (root.left != null) {
                goUntilNull(root.left, list);
            }
            if (root.right != null) {
                goUntilNull(root.right, list);
            }
        }
    }
}
