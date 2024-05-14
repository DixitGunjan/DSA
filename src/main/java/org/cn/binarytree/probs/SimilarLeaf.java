package org.cn.binarytree.probs;

import org.cn.binarytree.BinaryTreeNode;
import org.cn.binarytree.basics.TakeInputLevelWise;

import java.util.ArrayList;
import java.util.List;

public class SimilarLeaf {
    public static boolean leafSimilar(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1 = getLeaves(root1, list1);
        list2 = getLeaves(root2, list2);

        return list1.equals(list2);

    }

    public static List<Integer> getLeaves(BinaryTreeNode<Integer> root, List<Integer> list) {

        if (root == null) return null;

        if (root.left == null && root.right == null) {
            list.add(root.data);
        }

        getLeaves(root.left, list);
        getLeaves(root.right, list);

        return list;

    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root1 = TakeInputLevelWise.takeInput();
        BinaryTreeNode<Integer> root2 = TakeInputLevelWise.takeInput();
        System.out.println(leafSimilar(root1, root2));
    }
}
