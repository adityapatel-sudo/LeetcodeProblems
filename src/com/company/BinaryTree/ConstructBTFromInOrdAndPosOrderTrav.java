package com.company.BinaryTree;

import java.util.Arrays;

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
public class ConstructBTFromInOrdAndPosOrderTrav {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0)return null;
        return recu(inorder,postorder);
    }
    public static TreeNode recu(int[] inorder,int[] postorder){
        TreeNode treeNode = new TreeNode();
        if(inorder.length==0){
            return null;
        }
        if(inorder.length==1) {
            treeNode.val=inorder[0];
            return treeNode;
        }
        int curVal = postorder[postorder.length-1];
        int indexCurValInorder = 0;
        for(int i = 0; i < inorder.length;i++){
            if(inorder[i]==curVal)indexCurValInorder = i;
        }
        treeNode.left = recu(
                Arrays.copyOfRange(inorder,0,indexCurValInorder),
                Arrays.copyOfRange(postorder,0,indexCurValInorder)
        );
        if(!(inorder.length<=indexCurValInorder+1))
            treeNode.right = recu(
                    Arrays.copyOfRange(inorder,indexCurValInorder+1,inorder.length),
                    Arrays.copyOfRange(postorder,indexCurValInorder,postorder.length-1)
            );
        treeNode.val = curVal;
        return treeNode;
    }
}
