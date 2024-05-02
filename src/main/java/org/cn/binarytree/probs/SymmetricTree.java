package org.cn.binarytree.probs;

import org.cn.binarytree.BinaryTreeNode;

public class SymmetricTree {

    public static boolean isSymmetric(BinaryTreeNode<Integer> root) {
        if (root == null) return true;

        else return isMirror(root.left, root.right);
    }

    private static boolean isMirror(BinaryTreeNode<Integer> left, BinaryTreeNode<Integer> right) {

        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) return false;

        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
