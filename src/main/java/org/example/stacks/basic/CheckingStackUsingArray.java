package org.example.stacks.basic;

import org.example.stacks.exceptions.StackEmptyException;
import org.example.stacks.exceptions.StackFullException;
import org.example.stacks.StackUsingArray;

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
