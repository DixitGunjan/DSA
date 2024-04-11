package org.cn.test;

import org.cn.linkedlist.Node;
import org.cn.queue.exceptions.QueueEmptyException;
import org.cn.queue.exceptions.QueueFullException;

public class DoubleEndedQueueUsingArray {

    private int[] data;
    private int size;

    private int frontInsert = -1, rearInsert = -1, frontDelete = -1, rearDelete = -1;

    public DoubleEndedQueueUsingArray(int size) {
        data = new int[size];
        frontInsert = 0;
        frontDelete = 0;
        rearInsert = data.length - 1;
        rearDelete = data.length - 1;
    }

    public void insertFront(int element) throws QueueFullException {

        if (size == data.length) {
            throw new QueueFullException("Queue is Full");
        }
        if (frontInsert == data.length) {
            frontInsert = 0;
        }
        data[frontInsert++] = element;
        size++;
        if (frontInsert == data.length) {
            frontInsert = 0;
        }
    }

    public void insertRear(int element) throws QueueFullException {

        if (size == data.length) {
            throw new QueueFullException("Queue is Full");
        }
        data[rearInsert--] = element;
        size++;
        if (rearInsert == 0) {
            rearInsert = data.length - 1;
        }
    }

    public int deleteFront() throws QueueEmptyException {

        if (size == 0) {
            throw new QueueEmptyException("Queue is Empty");
        }

        if (frontDelete == data.length) {
            frontDelete = 0;
        }
        int temp = data[frontDelete];
        data[frontDelete++] = 0;
        size--;
        if (frontDelete == data.length) {
            frontDelete = 0;
        }
        if (size == 0) {
            frontDelete = -1;
            frontInsert = -1;
            rearInsert = -1;
            rearDelete = -1;
        }
        return temp;
    }

    public int deleteRear() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException("Queue is Empty");
        }

        if (rearDelete == 0) {
            rearDelete = data.length - 1;
        }
        int temp = data[rearDelete];
        data[rearDelete--] = 0;
        size--;
        if (size == 0) {
            frontDelete = -1;
            frontInsert = -1;
            rearInsert = -1;
            rearDelete = -1;
        }
        return temp;
    }

    public int getFront() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException("Queue is Empty");
        }
        return data[frontDelete];
    }

    public int getRear() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException("Queue is Empty");
        }
        return data[rearDelete];
    }

    public void printQueue() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) throws QueueFullException, QueueEmptyException {
        DoubleEndedQueueUsingArray dequeue = new DoubleEndedQueueUsingArray(10);

        dequeue.insertFront(1);
        dequeue.insertFront(2);
        dequeue.insertFront(3);
        dequeue.insertFront(4);
        dequeue.printQueue();

        dequeue.insertRear(5);
        dequeue.insertRear(6);
        dequeue.insertRear(7);
        dequeue.insertRear(8);

        dequeue.printQueue();


        dequeue.deleteFront();
        dequeue.deleteRear();

        dequeue.printQueue();
        System.out.println("Front " + dequeue.getFront());
        System.out.println("rear " + dequeue.getRear());

    }


}
