package org.cn.stacks;

import org.cn.stacks.exceptions.StackEmptyException;
import org.cn.stacks.exceptions.StackFullException;

public class StackUsingArray {
    private int[] data;
    private int topIndex;

    public StackUsingArray(int size) {
        data = new int[size];
        topIndex = -1;
    }

    //O(1)
    public void push(int element) throws StackFullException {
        //if Stack is Full
        if (topIndex == data.length - 1) {
            throw new StackFullException("Stack is Full");
        }
        data[++topIndex] = element;
    }

    //O(1)
    public int size() {
        return topIndex + 1;
    }

    //O(1)
    public int pop() throws StackEmptyException {
        if (topIndex == -1) {
            throw new StackEmptyException("Stack is Empty");
        }
        return data[topIndex--]; //returning the data which was removed and decreasing the index
    }

    //O(1)
    public int top() throws StackEmptyException {
        if (topIndex == -1) {
            throw new StackEmptyException("Stack is Empty");
        }
        return data[topIndex];
    }

    //O(1)
    public boolean isEmpty() {
        return topIndex == -1;
    }

    /** public void print() {
     Arrays.stream(data).forEach(System.out::println);
     } */

}
