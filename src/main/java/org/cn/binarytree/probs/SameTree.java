package org.cn.binarytree.probs;

import org.cn.binarytree.BinaryTreeNode;
import org.cn.binarytree.basics.TakeInputLevelWise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SameTree {

    public static boolean isSameTree(BinaryTreeNode<Integer> p, BinaryTreeNode<Integer> q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return p.data == q.data && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }


    public static void main(String[] args) {
        BinaryTreeNode<Integer> p = TakeInputLevelWise.takeInput();
        BinaryTreeNode<Integer> q = TakeInputLevelWise.takeInput();
        System.out.println(isSameTree(p, q));
    }
}
