package org.cn.queue;

import org.cn.queue.exceptions.QueueEmptyException;
import org.cn.queue.exceptions.QueueFullException;

public class QueueUsingArray {

    private int[] data;
    private int front, rear; //index of element of front and rear of the queue
    private int size; //size of queue

    public QueueUsingArray() {
        data = new int[5];
        front = -1; //setting it to zero will eman we have value at index 0
        rear = -1;
    }

    public QueueUsingArray(int capacity) {
        data = new int[capacity];
        front = -1; //setting it to zero will eman we have value at index 0
        rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(int element) throws QueueFullException {

        if (size == data.length)
            throw new QueueFullException("Queue Full");
        if (size == 0) {
            front++;
        }
        data[++rear] = element;
        size++;

    }

    public int front() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException("Queue Empty");
        }
        return data[front];
    }

    public int dequeue() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException("Queue Empty");
        }
        size--;
        return data[front++];
    }

    public int getFront() {
        return this.front;
    }

    public int getRear() {
        return this.rear;
    }

}
