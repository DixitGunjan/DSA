package org.cn.binarytree.probs;

import org.cn.binarytree.BinaryTreeNode;
import org.cn.binarytree.basics.TakeInputLevelWise;

public class ReplaceNodesWithDepth {

    public static void changeToDepthTree(BinaryTreeNode<Integer> root, int k) {

        if (root == null) return;

        root.data = k;

        changeToDepthTree(root.right, k + 1);
        changeToDepthTree(root.left, k + 1);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInput();
        changeToDepthTree(root, 0);
        printTree(root);
    }

    private static void printTree(BinaryTreeNode<Integer> root) {

        if (root == null) return;

        printTree(root.left);
        System.out.print(root.data + " ");
        printTree(root.right);
    }
}
