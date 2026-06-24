package org.cn.binarysearchtree.problems;

import org.cn.binarysearchtree.BinarySearchTreeNode;
import org.cn.binarysearchtree.basic.BinarySearchTreeUse;
import org.cn.binarytree.BinaryTreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FloorAndCeilInBST {

    void main() {
        BinarySearchTreeNode<Integer> root = BinarySearchTreeUse.insertIntoBST(null, 8);
        BinarySearchTreeUse.insertIntoBST(root, 4);
        BinarySearchTreeUse.insertIntoBST(root, 12);
        BinarySearchTreeUse.insertIntoBST(root, 2);
        BinarySearchTreeUse.insertIntoBST(root, 6);
        BinarySearchTreeUse.insertIntoBST(root, 10);
        List<Integer> list = new ArrayList<>();
        Integer[] result = {-1, -1};
        int k = 11;
        floorAndCeilInBST(root, k, result);


        Arrays.stream(result).forEach(System.out::println);
    }

    private void floorAndCeilInBST(BinarySearchTreeNode<Integer> root, int k, Integer[] result) {
        if (root == null) return;
        if (root.data == k) {
            result[0] = root.data;
            result[1] = root.data;
        } else if (root.data > k) {
            result[1] = root.data;
            floorAndCeilInBST(root.left, k, result);
        } else {
            result[0] = root.data;
            floorAndCeilInBST(root.right, k, result);
        }
    }
}
