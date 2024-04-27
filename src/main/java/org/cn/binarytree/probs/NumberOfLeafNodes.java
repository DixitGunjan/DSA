package org.cn.binarytree.probs;

import org.cn.binarytree.BinaryTreeNode;
import org.cn.binarytree.basics.TakeInputLevelWise;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfLeafNodes {

    public static int numberOfLeafNodes(BinaryTreeNode<Integer> root) {
        Queue<BinaryTreeNode<Integer>> tree = new LinkedList<>();

        if (root == null) return 0;

        tree.add(root);
        int count = 0;
        while (!tree.isEmpty()) {
            BinaryTreeNode<Integer> front = tree.poll();
            if (front.left != null) tree.add(front.left);
            if (front.right != null) tree.add(front.right);

            if (front.left == null || front.right == null) count++;

        }
        return count;

    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInput();
        System.out.println(numberOfLeafNodes(root));

    }
}
