package org.cn.binarytree.probs;

import org.cn.binarytree.BinaryTreeNode;
import org.cn.binarytree.basics.TakeInputLevelWise;

import static org.cn.binarytree.probs.DepthOfATree.height;

public class DiameterOfTree {

    public static int diameter(BinaryTreeNode<Integer> root) {

        if (root == null) return 0;

        int lheight = height(root.left);
        int rheight = height(root.right);

        int lDiameter = diameter(root.left);
        int rDiameter = diameter(root.right);

        return Math.max(lheight + rheight + 1, Math.max(lDiameter, rDiameter));

    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInput();
        System.out.println(diameter(root));
    }
}
