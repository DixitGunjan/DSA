package org.cn.binarytree.probs;

import org.cn.binarytree.BinaryTreeNode;

public class InvertBinaryTree {

    public BinaryTreeNode<Integer> invertTree(BinaryTreeNode<Integer> root) {
        if (root == null) return null;
        else return new BinaryTreeNode<>(root.data, root.right, root.left);
    }

    public void mirrorTree(BinaryTreeNode<Integer> root) {
        if (root == null) return;

        mirrorTree(root.left);
        mirrorTree(root.right);

        BinaryTreeNode<Integer> tempLeft = root.left;
        root.left = root.right;
        root.right = tempLeft;
    }
}
