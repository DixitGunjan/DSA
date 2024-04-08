package org.cn.queue;

import org.cn.queue.exceptions.QueueEmptyException;
import org.cn.queue.exceptions.QueueFullException;

public class QueueUsingDynamicArray {
    private int[] data;
    private int front, rear; //index of element of front and rear of the queue
    private int size; //size of queue

    public QueueUsingDynamicArray() {
        data = new int[5];
        front = -1; //setting it to zero will mean we have value at index 0
        rear = -1;
    }

    public QueueUsingDynamicArray(int capacity) {
        data = new int[capacity];
        front = -1; //setting it to zero will mean we have value at index 0
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
            doubleCapacity(data);
        if (size == 0) {
            front++;
        }
        data[++rear] = element;
        if (rear == data.length) { //Setting it to zero as Circular Queue will come int o picture
            rear = 0;
        }
        size++;

    }

    private void doubleCapacity(int[] data) {

        int[] temp = data;
        data = new int[2 * temp.length];
        int index = 0;

        //Copying in FIFO sequence
        for (int i = front; i < temp.length; i++) {
            data[index++] = temp[i];
        }
        for (int i = 0; i < front - 1; i++) {
            data[index++] = temp[i];
        }
        front = 0;
        rear = temp.length - 1;
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
        int temp = data[front];
        front++;

        if (front == data.length) {       //Setting for circular queue
            front = 0;
        }
        size--;
        if (size == 0) {   //If last element is removed set queue to initial Stage
            front = -1;
            rear = -1;
        }
        return temp;
    }

    public void print() {
        for (int i : data) {
            System.out.println(i);
        }
    }

    public int getFront() {
        return this.front;
    }

    public int getRear() {
        return this.rear;
    }
}
