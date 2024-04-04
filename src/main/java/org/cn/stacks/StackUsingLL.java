package org.cn.stacks;

import org.cn.linkedlist.Node;
import org.cn.stacks.exceptions.StackEmptyException;

public class StackUsingLL<T> {
    private Node<T> head;
    private int size;

    //Default Values not, required anyways
    public StackUsingLL() {
        head = null;
        size = 0;
    }

    //O(1)
    public int size() {
        return size;
    }

    //O(1)
    public boolean isEmpty() {
        return size == 0;

    }

    //O(1)
    //Entering at begining of LL
    public void push(T element) {
        Node<T> tempNode = new Node<>(element);
        tempNode.next = head;
        head = tempNode;
        size++;
    }

    //O(1)
    public T top() throws StackEmptyException {
        if (head == null) {
            throw new StackEmptyException("Stack is Empty");
        }
        return head.data;
    }

    //O(1)
    public T pop() throws StackEmptyException {
        if (head == null) {
            throw new StackEmptyException("Stack is Empty");
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
}
