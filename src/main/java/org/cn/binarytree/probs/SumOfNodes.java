package org.cn.binarytree.probs;

import org.cn.binarytree.BinaryTreeNode;
import org.cn.binarytree.basics.TakeInputLevelWise;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfNodes {

    public static void sum(BinaryTreeNode<Integer> root) {

        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        int sum = 0;

        if (root == null) {
            System.out.println("tree is empty and sum is : " + sum);
            return;
        }

        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryTreeNode<Integer> tempRoot = queue.poll();
            sum += tempRoot.data;

            if (tempRoot.left != null) {
                queue.add(tempRoot.left);
            }

            if (tempRoot.right != null) {
                queue.add(tempRoot.right);
            }
        }

        System.out.println("the Sum of Tree is : " + sum);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInput();
        sum(root);
    }
}
