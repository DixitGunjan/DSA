package org.cn.avltree;

public class AVLTreeNode<T> {
   public T data;
   public AVLTreeNode<T> left;
   public AVLTreeNode<T> right;
   public int height;

    public AVLTreeNode() {
        this.height = 0;
    }

    public AVLTreeNode(T data) {
        this.data = data;
        this.height = 1;
    }
}
