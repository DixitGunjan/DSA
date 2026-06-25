package org.cn.binarysearchtree.problems;

import org.cn.binarysearchtree.BinarySearchTreeNode;
import org.cn.binarysearchtree.basic.BinarySearchTreeUse;

public class CheckIFATreeIsBST {
    void main() {
        BinarySearchTreeNode<Integer> root = BinarySearchTreeUse.insertIntoBST(null, 8);
        BinarySearchTreeUse.insertIntoBST(root, 4);
        BinarySearchTreeUse.insertIntoBST(root, 12);
        BinarySearchTreeUse.insertIntoBST(root, 2);
        BinarySearchTreeUse.insertIntoBST(root, 6);
        BinarySearchTreeUse.insertIntoBST(root, 10);
        Long min = Long.MIN_VALUE;
        Long max = Long.MAX_VALUE;
        System.out.println(isBST(root, min, max));
    }

    private boolean isBST(BinarySearchTreeNode<Integer> root, Long min, Long max) {
        if (root == null) return true;
        if (root.data <= min || root.data > max) return false;
        return isBST(root.left, min, Long.valueOf(root.data)) && isBST(root.right, Long.valueOf(root.data), max);
    }
}
