package org.cn.binarytree.probs;

import org.cn.binarytree.BinaryTreeNode;

public class InvertBinaryTree {

    public BinaryTreeNode<Integer> invertTree(BinaryTreeNode<Integer> root) {
        if(root == null) return null;
        else return new BinaryTreeNode<Integer>(root.data, root.right, root.left);
    }
}
