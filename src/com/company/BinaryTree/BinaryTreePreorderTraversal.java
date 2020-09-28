package com.company.BinaryTree;

import java.util.*;

class Solution {
    public List < Integer > inorderTraversal(TreeNode root) {
        List < Integer > res = new ArrayList < > ();
        goUntilNull(root, res);
        return res;
    }

    public void goUntilNull(TreeNode root, List < Integer > res) {
        if (root != null) {
            if (root.left != null) {
                goUntilNull(root.left, res);
            }
            res.add(root.val);
            if (root.right != null) {
                goUntilNull(root.right, res);
            }
        }
    }
}
