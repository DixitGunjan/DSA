package org.cn.binarysearchtree.basic;

import org.cn.binarysearchtree.BinarySearchTreeNode;
import java.util.Scanner;

public class BinarySearchTreeUse {


    public static void main(String[] args) {
        BinarySearchTreeNode<Integer> binarySearchTreeNode = null;

        for (int i = 0; i < 5; i++) {
            binarySearchTreeNode = insertIntoBST(binarySearchTreeNode, new Scanner(System.in).nextInt());
        }

        print(binarySearchTreeNode);

        System.out.println("Pre-OrderTraversal");
        pre_Order(binarySearchTreeNode);

        System.out.println("Post_Order Traversal");
        post_Order(binarySearchTreeNode);

        System.out.println("InOrder Traversal");
        inLine(binarySearchTreeNode);
    }


    public static BinarySearchTreeNode<Integer> insertIntoBST(BinarySearchTreeNode<Integer> currNode, int data) {

        if (currNode == null) {
            currNode = new BinarySearchTreeNode<>(data);
            return currNode;
        }

        if (data >= currNode.data) {
            currNode.right = insertIntoBST(currNode.right, data);
        } else {
            currNode.left = insertIntoBST(currNode.left, data);
        }
        return currNode;
    }

    private static void print(BinarySearchTreeNode<Integer> bst) {

        if (bst == null) return;

        if (bst.left != null || bst.right != null) {           //just for looking fancy
            System.out.println(bst.data);
        }
        if (bst.left != null) System.out.println(" L" + bst.left.data);
        if (bst.right != null) System.out.println(" R" + bst.right.data);

        print(bst.left);
        print(bst.right);
    }

    private static void inLine(BinarySearchTreeNode<Integer> bst) {
        if (bst == null) {
            return;
        }

        inLine(bst.left);
        System.out.println(bst.data);
        inLine(bst.right);
    }

    private static void pre_Order(BinarySearchTreeNode<Integer> bst) {
        if (bst == null) {
            return;
        }

        System.out.println(bst.data);
        inLine(bst.left);
        inLine(bst.right);
    }

    private static void post_Order(BinarySearchTreeNode<Integer> bst) {
        if (bst == null) {
            return;
        }

        inLine(bst.left);
        inLine(bst.right);
        System.out.println(bst.data);
    }
}
