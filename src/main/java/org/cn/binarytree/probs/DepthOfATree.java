package org.cn.binarytree.probs;

import org.cn.binarytree.BinaryTreeNode;
import org.cn.binarytree.basics.TakeInputLevelWise;

public class DepthOfATree {

    public static int height(BinaryTreeNode<Integer> root) {
        int leftHeight = 0;
        int rightHeight = 0;
        if (root == null) return 0;

        if (root.left != null) {

            leftHeight += height(root.left);
        }
        if (root.right != null) {
            rightHeight += height(root.right);
        }

        if(leftHeight > rightHeight) return leftHeight + 1;
        else return rightHeight + 1;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInput();
        System.out.println(height(root));
    }
}
