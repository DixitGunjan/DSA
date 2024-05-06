package org.cn.binarytree.probs;

import org.cn.binarytree.BinaryTreeNode;
import org.cn.binarytree.basics.TakeInputLevelWise;

public class RemoveLeafNode {

    public static BinaryTreeNode<Integer> removeLeaf(BinaryTreeNode<Integer> root) {
        if (root == null) return null;

        if (root.left == null && root.right == null) {
            return null;
        }

        root.left = removeLeaf(root.left);
        root.right = removeLeaf(root.right);
        return root;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInput();
        root = removeLeaf(root);
        TakeInputLevelWise.printLevelWise(root);
    }
}
