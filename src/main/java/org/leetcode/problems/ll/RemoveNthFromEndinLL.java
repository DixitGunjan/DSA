package org.leetcode.problems.ll;

import java.util.Scanner;

public class RemoveNthFromEndinLL {
    public static void main(String[] args) {
        LinkedListNode<Integer> head = LinkedListNode.createLL();
        int length = LinkedListNode.length(head);
        System.out.println("length -" + length);
        int n = new Scanner(System.in).nextInt();
        removeNthNode(head, n, length);
        LinkedListNode.printLL(head);
    }

    private static void removeNthNode(LinkedListNode<Integer> head, int n, int length) {
        if (n > length) {
            return;
        }
       // LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> curr = head;
        int target = length - n;

        if (target == 0) {
            head = head.next;
            return;
        }
        while (curr != null) {
            if (target == 1) {
                curr.next = curr.next.next;
            }
            curr = curr.next;
            target--;
        }
    }
}
