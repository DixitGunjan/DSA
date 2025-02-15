package org.cn.avltree.basic;

import org.cn.avltree.AVLTreeNode;

public class AVLTreeBasicOperations {

    static int height(AVLTreeNode<Integer> node) {
        if (node == null) return 0;
        return node.height;
    }

    static AVLTreeNode<Integer> leftRotate(AVLTreeNode<Integer> disbalanced) {
        /*
         AVLTreeNode<Integer> newRoot1 = disbalanced.right;
        disbalanced.right = newRoot1.left;
        newRoot1.left = disbalanced;
         */
        AVLTreeNode<Integer> newRoot = disbalanced.right;
        AVLTreeNode<Integer> tempNode = newRoot.left;

        newRoot.left = disbalanced;
        disbalanced.right = tempNode;

        newRoot.height = 1 + Math.max(height(newRoot.left), height(newRoot.right));
        disbalanced.height = 1 + Math.max(height(disbalanced.left), height(disbalanced.right));

        return newRoot;

    }

    static AVLTreeNode<Integer> rotateRight(AVLTreeNode<Integer> disbalanced) {
       /* AVLTreeNode<Integer> newRoot1 = disbalanced.left;
        disbalanced.left = newRoot1.right;
        newRoot1.right = disbalanced;*/
        AVLTreeNode<Integer> newRoot = disbalanced.left;
        AVLTreeNode<Integer> tempNode = newRoot.right;

        newRoot.right = disbalanced;
        disbalanced.left = tempNode;

        newRoot.height = 1 + Math.max(height(newRoot.left), height(newRoot.right));
        disbalanced.height = 1 + Math.max(height(disbalanced.left), height(disbalanced.right));

        return newRoot;

    }


    static int getBalance(AVLTreeNode<Integer> node) {
        if (node == null) return 0;
        return height(node.left) - height(node.right);
    }


    static AVLTreeNode<Integer> insert(AVLTreeNode<Integer> node, int data) {
        if (node == null) {
            return new AVLTreeNode<>(data);
        }

        if (data > node.data) {
            node.right = insert(node.right, data);
        } else if (data < node.data) {
            node.left = insert(node.left, data);
        } else {
            return node;
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        if (balance > 1 && data < node.left.data) { //LL
            return rotateRight(node);
        }

        if (balance < -1 && data > node.right.data) { //RR
            return leftRotate(node);
        }

        if (balance > 1 && data > node.left.data) { //LR
            node.left = leftRotate(node.left);
            return rotateRight(node);
        }

        if (balance < -1 && data < node.right.data) {  //RL
            node.right = rotateRight(node.right);
            return leftRotate(node);
        }
        return node;
    }

    public static void main(String[] args) {

    }
}
