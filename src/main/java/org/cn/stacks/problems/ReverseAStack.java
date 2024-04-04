package org.cn.stacks.problems;

import org.cn.stacks.StackUsingLL;
import org.cn.stacks.exceptions.StackEmptyException;

import java.util.Scanner;

public class ReverseAStack {

    private static void reverseAStack(StackUsingLL<Integer> input, StackUsingLL<Integer> output) throws StackEmptyException {

        if (input.isEmpty())
            System.out.println("Stack is Empty");

        while (!input.isEmpty()) {
            output.push(input.pop());
        }

        while (!output.isEmpty()) {
            System.out.println(output.pop());
        }
    }

    public static void main(String[] args) throws StackEmptyException {
        StackUsingLL<Integer> input = new StackUsingLL<>();
        StackUsingLL<Integer> output = new StackUsingLL<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            input.push(sc.nextInt());
        }
        reverseAStack(input, output);
    }
}
