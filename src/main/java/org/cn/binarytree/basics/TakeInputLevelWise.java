package org.cn.binarytree.basics;

import org.cn.binarytree.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInputLevelWise {

    public static BinaryTreeNode<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();

        if (rootData == -1) return null;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<>();

        pendingChildren.add(root);

        while (!pendingChildren.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingChildren.poll();

            System.out.println("Enter left child of : " + front.data);
            int left = sc.nextInt();
            if (left != -1) {
                BinaryTreeNode<Integer> frontLeft = new BinaryTreeNode<>(left);
                front.left = frontLeft;
                pendingChildren.add(frontLeft);
            }

            System.out.println("Enter right child of : " + front.data);
            int right = sc.nextInt();
            if (right != -1) {
                BinaryTreeNode<Integer> frontRight = new BinaryTreeNode<>(right);
                front.right = frontRight;
                pendingChildren.add(frontRight);
            }

        }
        return root;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput();
        BinaryTreeUsebasic.printTree(root);
    }
}
