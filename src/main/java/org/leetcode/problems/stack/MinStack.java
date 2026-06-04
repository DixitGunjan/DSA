package org.leetcode.problems.stack;

import java.util.Stack;

/**
 * Min stack will keep minimum elemnt on top
 * main stack will keep all elements
 */
public class MinStack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        mainStack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        int x = mainStack.pop();
        if (x == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
