package org.cn.binarytree.probs;

import org.cn.binarytree.BinaryTreeNode;
import org.cn.binarytree.basics.TakeInputLevelWise;


public class TreeTraversal {

    public static void postOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
        System.out.println();
    }

    public static void preOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
        System.out.println();
    }

    public static void inOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
        System.out.println();
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInput();
        postOrder(root);
        preOrder(root);
        inOrder(root);
    }
}
