package com.company.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class InoderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List <Integer> list = new ArrayList<>();
        goUntilNull(root, list);
        return list;
    }
    public static void goUntilNull(TreeNode root, List <Integer> list) {
        if (root != null) {
            if (root.left != null) {
                goUntilNull(root.left, list);
            }
            list.add(root.val);

            if (root.right != null) {
                goUntilNull(root.right, list);
            }
        }
    }
}
