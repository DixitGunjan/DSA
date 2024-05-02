package org.cn.binarytree.probs;

import org.cn.binarytree.BinaryTreeNode;
import org.cn.binarytree.basics.TakeInputLevelWise;

public class PrintAllNodesAtDepthK {

    public static void printNodes(BinaryTreeNode<Integer> root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.println(root.data);
        }

        printNodes(root.left, k - 1);
        printNodes(root.right, k - 1);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInput();
        printNodes(root, 1);
    }
}
