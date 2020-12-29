package com.company.BinaryTree;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        if(root.left == null ^ root.right== null) return false;
        else if (root.left == null && root.right== null) return true;
        return recu(root.left,root.right);
    }
    public boolean recu(TreeNode left, TreeNode right){
        if(left.val!=right.val) return false;
        if ((left.right==null ^ right.left==null)||(left.left==null ^ right.right==null))return  false;
        if(left.right == null && right.left == null&&left.left == null && right.right == null) return true;
        if(left.right == null && right.left == null) return recu(left.left,right.right);
        if(left.left == null && right.right == null) return recu(left.right,right.left);

        return (recu(left.left,right.right))&&(recu(left.right,right.left));
    }
}
