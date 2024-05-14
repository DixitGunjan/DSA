package org.cn.binarytree.probs;

import org.cn.binarytree.BinaryTreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MinMaxInBinaryTree {
    Pair<Integer, Integer> minMaxInTree(BinaryTreeNode<Integer> root) {
        int min = 0;
        int max = 0;

        if (root == null) {
            return null;
        }
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<>();
        pendingChildren.add(root);
        min = root.data;

        while (!pendingChildren.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingChildren.poll();
            if (front.data >= max) {
                max = front.data;
            }

            if (front.data <= min) {
                min = front.data;
            }

            if (front.left != null) pendingChildren.add(front.left);
            if (front.right != null) pendingChildren.add(front.right);

        }
        return new Pair<>(min, max);


    }

    class Pair<T, U> {
        T minimum;
        U maximum;

        public Pair(T minimum, U maximum) {
            this.minimum = minimum;
            this.maximum = maximum;
        }

    }

    public static void main(String[] args) {
        String abc = "abc";
        Arrays.sort(abc.toCharArray());
    }

}

