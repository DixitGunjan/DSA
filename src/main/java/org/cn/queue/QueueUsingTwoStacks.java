package org.cn.queue;

import org.cn.queue.exceptions.QueueEmptyException;

import java.util.Stack;

public class QueueUsingTwoStacks<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;
    private int size;

    public QueueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T front() throws QueueEmptyException {
        if (size == 0) throw new QueueEmptyException("Queue is Empty");
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        T front = stack2.peek();
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return front;
    }

    public int getSize() {
        return size;
    }

    public void enqueue(T element) {
        stack1.push(element);
        size++;
    }

    public T dequeue() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException("Queue is Empty");
        }

        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        T temp = stack2.pop();
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        size--;
        return temp;

    }


}
