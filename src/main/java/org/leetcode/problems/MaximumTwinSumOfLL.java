package org.leetcode.problems;

import org.cn.linkedlist.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MaximumTwinSumOfLL {

    public static int twinSum(Node<Integer> head) {

        List<Integer> resultOfSum = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        Node<Integer> tempHead = head;

        while (tempHead != null) {
            stack.push(tempHead.data);
            tempHead = tempHead.next;
        }
        int stackSize = stack.size() / 2;
        while (stack.size() > stackSize) {
            resultOfSum.add(head.data + stack.pop());
            head = head.next;
        }
        return Collections.max(resultOfSum);
    }

    public static void main(String[] args) {
        Node<Integer> head = Node.insert();
        System.out.println(twinSum(head));
    }
}
