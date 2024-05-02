package org.cn.binarytree.probs;

import org.cn.binarytree.BinaryTreeNode;
import org.cn.binarytree.basics.TakeInputLevelWise;

import java.util.LinkedList;
import java.util.Queue;

//TOdo:
public class NodesWithoutSiblings {
    public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {

        if (root == null) {
            System.out.println("Tree is Empty");
        } else if (root.left != null && root.right == null) {
            System.out.println("No right Sibling for " + root.left.data);
        } else if (root.left == null && root.right != null) {
            System.out.println("No left Sibling for " + root.right.data);
        }
        if (root.left != null) {
            printNodesWithoutSibling(root.left);
        }
        if (root.right != null) {
            printNodesWithoutSibling(root.right);
        }

    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInput();
        printNodesWithoutSibling(root);
    }
}
