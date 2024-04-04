package org.cn.stacks;

import org.cn.stacks.exceptions.StackEmptyException;

public class StackUsingArrayDoubleCapacity {
    private int[] data;
    private int topIndex;

    public StackUsingArrayDoubleCapacity() {
        data = new int[2];
        topIndex = -1;
    }

    //O(1)
    public void push(int element){
        //if Stack is Full
        if (topIndex == data.length - 1) {
            doubleCapacityOfStack();
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

    private void doubleCapacityOfStack() {
        int[] temp = data;
        data = new int[2 * temp.length];
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }
    /** public void print() {
     Arrays.stream(data).forEach(System.out::println);
     } */

}
