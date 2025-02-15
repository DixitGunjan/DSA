package org.cn.binarysearchtree;

import org.cn.binarytree.BinaryTreeNode;

public class BinarySearchTreeNode<T> {
    public T data;
    public BinarySearchTreeNode<T> left;
    public BinarySearchTreeNode<T> right;

    public BinarySearchTreeNode() {
        this.data = null;
        this.left = this.right = null;
    }
    public BinarySearchTreeNode(T data) {
        this.data = data;
        this.left = this.right = null;
    }


}
