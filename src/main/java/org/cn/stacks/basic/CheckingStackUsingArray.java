package org.cn.stacks.basic;

import org.cn.stacks.exceptions.StackEmptyException;
import org.cn.stacks.exceptions.StackFullException;
import org.cn.stacks.StackUsingArray;

public class CheckingStackUsingArray {
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        StackUsingArray stack = new StackUsingArray(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("The top element is - " + stack.top());
        System.out.println("The Size of Stack is - " + stack.size());

        stack.pop();

        System.out.println("After pop() The top element is - " + stack.top());
        System.out.println("After pop() The Size of Stack is - " + stack.size());

        System.out.println("If Stack is Empty - " + stack.isEmpty());

        //stack.print();
    }
}
