package org.leetcode.problems.trees;

import org.cn.binarytree.BinaryTreeNode;
import org.cn.binarytree.basics.TakeInputLevelWise;

import java.util.LinkedList;
import java.util.List;

public class AllTraversalsInOne {
    void main() {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInput();
        System.out.println(traversals(root));
    }

    private List<List<BinaryTreeNode<Integer>>> traversals(BinaryTreeNode<Integer> root) {
        List<List<BinaryTreeNode<Integer>>> result = new LinkedList<>();
        result.add(preOrderHelper(root));
        result.add(inOrderHelper(root));
        result.add(postOrderHelper(root));
        return result;
    }

    //Pre-order
    private List<BinaryTreeNode<Integer>> preOrderHelper(BinaryTreeNode<Integer> root) {
        List<BinaryTreeNode<Integer>> result = new LinkedList<>();
        preOrder(root, result);
        return result;
    }

    private void preOrder(BinaryTreeNode<Integer> root, List<BinaryTreeNode<Integer>> result) {
        if (root == null) return;

        result.add(root);
        preOrder(root.left, result);
        preOrder(root.right, result);
    }

    //int-order
    private List<BinaryTreeNode<Integer>> inOrderHelper(BinaryTreeNode<Integer> root) {
        List<BinaryTreeNode<Integer>> result = new LinkedList<>();
        inOrder(root, result);
        return result;
    }

    private void inOrder(BinaryTreeNode<Integer> root, List<BinaryTreeNode<Integer>> result) {
        if (root == null) return;

        inOrder(root.left, result);
        result.add(root);
        inOrder(root.right, result);
    }

    //post-order
    private List<BinaryTreeNode<Integer>> postOrderHelper(BinaryTreeNode<Integer> root) {
        List<BinaryTreeNode<Integer>> result = new LinkedList<>();
        postOrder(root, result);
        return result;
    }

    private void postOrder(BinaryTreeNode<Integer> root, List<BinaryTreeNode<Integer>> result) {
        if (root == null) return;

        postOrder(root.left, result);
        postOrder(root.right, result);
        result.add(root);
    }
}
