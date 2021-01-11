package com.company.BinaryTree;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)return false;
        return asdf(root,0,sum);
    }
    public static boolean asdf(TreeNode root, int soFar, int wanted){
        soFar+= root.val;
        if(soFar==wanted){
            return root.left == null && root.right == null;
        }
        if(root.left == null && root.right == null){
            return false;
        }
        if(root.left!=null&&asdf(root.left,soFar,wanted)) return true;
        if(root.right!=null&&asdf(root.right,soFar,wanted))return true;
        if(root.left!=null&&root.right!=null){
            return asdf(root.left,soFar,wanted)||asdf(root.right,soFar,wanted);
        }
        return false;
    }

}
