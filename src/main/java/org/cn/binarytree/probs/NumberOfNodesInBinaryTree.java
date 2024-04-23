package org.cn.binarytree.probs;

import org.cn.binarytree.BinaryTreeNode;
import org.cn.binarytree.basics.BinaryTreeUsebasic;

public class NumberOfNodesInBinaryTree {

    public static int count(BinaryTreeNode<Integer> root) {

        if (root == null) {
            return 0;
        }

        int leftNumb = count(root.left);
        int rightNumb = count(root.right);

        return 1 + leftNumb + rightNumb;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUsebasic.takeInputBetter(true, 0, true);

        System.out.println(count(root));

    }
}
