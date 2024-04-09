package org.cn.queue.problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseFirstKElementOfQueue {

    public static void reverseKQueue(Queue<Integer> input, int k) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        if (input.isEmpty() || input.size() == 1) {
            return;
        }

        for (int i = 0; i < k; i++) {
            stack1.push(input.poll());
        }
        while (!input.isEmpty()) {
            stack2.push(input.poll());
        }
        while (!stack1.isEmpty()) {
            input.add(stack1.pop());
        }
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        while (!stack1.isEmpty()) {
            input.add(stack1.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> input = new LinkedList<>();
        int k = new Scanner(System.in).nextInt();
        for (int i = 0; i < 6; i++) {
            input.add(i + 10);
        }

        reverseKQueue(input, k);

        System.out.println("After Reversal - ");
        while (!input.isEmpty()) {
            System.out.println(input.poll());
        }
    }
}
