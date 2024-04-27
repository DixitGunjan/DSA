package org.cn.binarytree.probs;

import org.cn.binarytree.BinaryTreeNode;
import org.cn.binarytree.basics.TakeInputLevelWise;

import java.util.LinkedList;
import java.util.Queue;

public class GreaterNodes {


    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
        //Your code goes here

        Queue<BinaryTreeNode<Integer>> tree = new LinkedList<>();

        if (root == null) return 0;

        tree.add(root);
        int count = 0;
        while (!tree.isEmpty()) {
            BinaryTreeNode<Integer> temp = tree.poll();

            if (temp.data > x) count++;

            if (temp.left != null) tree.add(temp.left);
            if (temp.right != null) tree.add(temp.right);

        }

        return count;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInput();
        System.out.println(countNodesGreaterThanX(root, 2));
    }
}
