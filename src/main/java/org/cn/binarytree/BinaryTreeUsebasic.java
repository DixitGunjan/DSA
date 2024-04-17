package org.cn.binarytree;

import org.cn.binarytree.BinaryTreeNode;

import java.util.Scanner;

public class BinaryTreeUsebasic {

    public static void printTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        if (root.left != null) {
            printTree(root.left);
        }
        if (root.right != null) {
            printTree(root.right);
        }

    }

    public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + ":");
        if (root.left != null) {
            System.out.print("L" + root.left.data + ", ");
        }
        if (root.right != null) {
            System.out.print("R" + root.right.data);
        }
        System.out.println();
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }

    public static BinaryTreeNode<Integer> takeInput() {
        System.out.println("Enter root data");
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();

        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeInput();
        BinaryTreeNode<Integer> rightChild = takeInput();

        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

    public static void main(String[] args) {
        /** BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
         BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
         BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);

         root.left = rootLeft;
         root.right = rootRight;

         BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>(4);
         BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(5);

         rootLeft.right = twoRight;
         rootRight.left = threeLeft; */
        BinaryTreeNode<Integer> root = takeInput();
        printTreeDetailed(root);
    }
}
