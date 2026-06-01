package org.leetcode.problems.ll;

import java.util.Scanner;

public class LinkedListNode<T> {
    int data;
    LinkedListNode<T> next;

    public LinkedListNode(int data) {
        this.data = data;
    }

    public static LinkedListNode<Integer> createLL() {
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != -1) {
            LinkedListNode<Integer> currNode = new LinkedListNode<>(n);
            if (head == null) {
                head = currNode;
                tail = currNode;
            } else {
                tail.next = currNode;
                tail = tail.next;
            }
            n = scanner.nextInt();
        }
        return head;
    }

    public static void printLL(LinkedListNode<Integer> head) {
        System.out.print("head -> ");
        while (head != null) {
            System.out.print(head.data);
            head = head.next;
            System.out.print(" -> ");
        }
        System.out.print("tail/null");
    }

    public static int length(LinkedListNode<Integer> head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}
