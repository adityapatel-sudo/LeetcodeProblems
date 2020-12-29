package com.company.BinaryTree;

public class SearchInABinarySearchTree {
    public static void main(String[] args){

    }
    public TreeNode searchBST(TreeNode root, int val){
        if(root == null || root.val == val){
            return root;
        }else if(root.val<val){
            return searchBST(root.right,val);
        }else if(root.val>val) {
            return searchBST(root.left,val);
        }
        return root;
    }
}
