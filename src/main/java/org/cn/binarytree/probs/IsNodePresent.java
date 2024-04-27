package org.cn.binarytree.probs;

import org.cn.binarytree.BinaryTreeNode;
import org.cn.binarytree.basics.TakeInputLevelWise;

import java.util.LinkedList;
import java.util.Queue;

public class IsNodePresent {

    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int data) {

        Queue<BinaryTreeNode<Integer>> tree = new LinkedList<>();

        if (root == null) return false;

        tree.add(root);
        boolean isPresent = false;

        if (root.data == data) isPresent = true;
        else {
            while (!tree.isEmpty()) {
                BinaryTreeNode<Integer> temp = tree.poll();

                if (temp.left != null) {
                    if (temp.left.data == data) {
                        isPresent = true;
                        break;
                    } else
                        tree.add(temp.left);
                }

                if (temp.right != null) {
                    if (temp.right.data == data) {
                        isPresent = true;
                        break;
                    } else
                        tree.add(temp.right);
                }
            }
        }
        return isPresent;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInput();
        System.out.println(isNodePresent(root, 3));
    }
}
