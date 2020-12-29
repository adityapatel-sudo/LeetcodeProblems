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
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        int max = recu(root,0);
        return max;
    }
    public static int recu(TreeNode root, int soFar){
        soFar++;
        int temp1=soFar,temp2=soFar;
        if(root.left!= null){
            temp1 = recu(root.left,temp1);
        }
        if(root.right!=null){
            temp2=recu(root.right,temp2);
        }
        return Math.max(temp1,temp2);
    }
}
