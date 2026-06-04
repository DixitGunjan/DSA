package org.leetcode.problems.stack;

public class MinStackUse {
    public static void main(String[] args) {
        MinStack minStackUse = new MinStack();
        minStackUse.push(-2);
        minStackUse.push(0);
        minStackUse.push(-3);
        System.out.println(minStackUse.getMin());
    }
}
