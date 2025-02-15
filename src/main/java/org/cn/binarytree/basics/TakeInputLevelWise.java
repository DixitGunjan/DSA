package org.cn.binarytree.basics;

import org.cn.binarytree.BinaryTreeNode;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInputLevelWise {

    public static BinaryTreeNode<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Tree Root -");
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


    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        if (root == null) {
            System.out.println("empty tree");
            return;
        }

        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryTreeNode<Integer> root1 = queue.poll();
            System.out.print(root1.data + ":");

            if (root1.left != null) {
                queue.add(root1.left);
                System.out.print("L:" + root1.left.data + ",");
            }
            if (root1.right != null) {
                queue.add(root1.right);
                System.out.print("R:" + root1.right.data);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput();
        printLevelWise(root);
        printRecursive(root);
    }


    public static void printRecursive(BinaryTreeNode<Integer> tree) {

        if (tree == null) return;
        System.out.println(tree.data);
        if (tree.left != null) {
            System.out.println(tree.data + "L - " + tree.left.data);
        }

        if (tree.right != null) {
            System.out.println(tree.data + "R - " + tree.right.data);
        }

        printRecursive(tree.left);
        printRecursive(tree.right);
    }
}
