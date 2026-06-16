package org.leetcode.problems.trees;

import org.cn.binarytree.BinaryTreeNode;
import org.cn.binarytree.basics.TakeInputLevelWise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTravesal {
    void main() {
        BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInput();
        System.out.println(levelOrder(root));
    }

    private List<List<Integer>> levelOrder(BinaryTreeNode<Integer> root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();  // Get number of nodes at current level
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {  // Process all nodes at this level
                BinaryTreeNode<Integer> node = queue.poll();
                currentLevel.add(node.data);

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            result.add(currentLevel);  // Add the complete level
        }

        return result;
    }
}
