package org.leetcode.problems.ll;

import java.util.Stack;

/**
 * Find Mid and store everything till mid in stack, then move slow and pop stack ,
 * if stack top matching slow then true else false
 */
public class PallindromeLinkedList {
    public static void main(String[] args) {
        LinkedListNode<Integer> head = LinkedListNode.createLL();
        System.out.println(isP(head));
    }

    private static boolean isP(LinkedListNode<Integer> head) {

        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        Stack<Integer> stack = new Stack<>();
        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) { // odd length
            slow = slow.next;
        }
        while (slow != null) {
            if (slow.data != stack.pop()) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
}
