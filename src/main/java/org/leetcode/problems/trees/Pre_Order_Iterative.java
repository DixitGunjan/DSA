package org.leetcode.problems.trees;

import org.cn.binarytree.BinaryTreeNode;
import org.cn.binarytree.basics.TakeInputLevelWise;

import java.util.*;

public class Pre_Order_Iterative {
    void main() {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInput();
        System.out.println(preOrderIterative(root));
    }

    private List<Integer> preOrderIterative(BinaryTreeNode<Integer> root) {
        List<Integer> result = new ArrayList<>();
        Stack<BinaryTreeNode<Integer>> stack = new Stack<>();
        if (root != null) {
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            BinaryTreeNode<Integer> front = stack.pop();
            result.add(front.data);

            if (front.right != null) {
                stack.add(front.right);
                //result.add(front.right.data);
            }
            if (front.left != null) {
                stack.add(front.left);
                //result.add(front.left.data);
            }

        }
        return result;
    }
}