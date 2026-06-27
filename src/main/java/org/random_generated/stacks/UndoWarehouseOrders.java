package org.random_generated.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class UndoWarehouseOrders {
    void main() {
        String[] strs = {"ADD 5", "ADD 3", "DOUBLE", "SUM", "UNDO", "SUM", "ADD 10", "SUM"};
        List<Integer> results = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (String str : strs) {
            if (str.contains("ADD")) {
                String[] split = str.split(" ");
                int val = Integer.parseInt(split[1]);
                stack.push(val);
                sum += val;
            } else if (str.contains("DOUBLE")) {
                if (!stack.isEmpty()) {
                    stack.push(stack.peek() * 2);
                    sum += stack.peek();
                }
            } else if (str.contains("UNDO")) {
                if (!stack.isEmpty()) {
                    int popped = stack.pop();
                    sum -= popped;
                }
            } else if (str.contains("SUM")) {
                results.add(sum);

            }
        }
        results.forEach(System.out::println);
    }
}
