package org.cn.binarytree.probs;

import org.cn.binarytree.BinaryTreeNode;

public class CreateAndInsertDuplicateNode {

    public static void insert(BinaryTreeNode<Integer> root){
        if(root == null) return;
        insert(root.left);
        insert(root.right);


        BinaryTreeNode<Integer> tempNode = root.left;
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(root.data);
        root.left = newNode;
        root.left.left = tempNode;
    }


}
