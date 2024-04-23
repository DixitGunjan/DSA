package org.leetcode.problems.stack;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {

    public static int[] asteroidCollision(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            if (num > 0 || stack.isEmpty()) {
                stack.push(num);
            } else {

                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(num)) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() == Math.abs(num)) {
                    stack.pop();
                } else {
                    if (stack.isEmpty() || stack.peek() < 0) {
                        stack.push(num);
                    }
                }
            }
        }

        int[] result = new int[stack.size()];

        int i = stack.size() - 1;
        while (!stack.isEmpty()) {
            result[i--] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, -5};
        int[] res = asteroidCollision(arr);

        Arrays.stream(res).forEach(System.out::println);

    }
}
