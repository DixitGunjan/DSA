package org.cn.binarytree.probs;

import org.cn.binarytree.BinaryTreeNode;
import org.cn.binarytree.basics.TakeInputLevelWise;

public class CheckSumChildren {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInput();

        System.out.println(CheckSumChildren.checksum(root));
    }

    private static int checksum(BinaryTreeNode<Integer> root) {
        if (root == null)
            return 1;

        int sum = 0;

        if (root.left != null) {
            sum += root.left.data;
        }
        if (root.right != null) sum += root.right.data;

        return ((root.data == sum) &&(checksum(root.left) == 1 && checksum(root.right) == 1) ? 1 : 0);
    }
}
