package org.cn.queue;

import org.cn.linkedlist.Node;
import org.cn.queue.exceptions.QueueEmptyException;

public class QueueUsingLL<T> {

    private Node<T> front;
    private Node<T> rear;
    private int size;

    //Not Required
    public QueueUsingLL() {
        front = null;
        rear = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public T getFront() throws QueueEmptyException {
        if (front == null) {
            throw new QueueEmptyException("Queue is Empty");
        }
        return front.data;
    }

    public T dequeue() throws QueueEmptyException {
        if (front == null) {
            throw new QueueEmptyException("Queue is Empty");
        }
        T frontElement = front.data;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return frontElement;
    }

    public void enqueue(T element) {
        Node<T> newNode = new Node<>(element);
        if (front == null && rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = rear.next;
        }
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
