package org.leetcode.problems.ll.dll;

import java.util.Scanner;

public class DoublyNode {
    public int data;
    public DoublyNode next;
    public DoublyNode prev;

    public DoublyNode(int data) {
        this.data = data;
    }

    public static DoublyNode createDLL() {
        DoublyNode head = null;
        DoublyNode tail = null;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != -1) {

            DoublyNode node = new DoublyNode(n);
            if (head == null) {
                head = node;
                tail = node;
                tail.next = null;
                head.prev = null;
            } else {
                tail.next = node;
                node.prev = tail;
                node.next = null;
                tail = node;
            }
            n = scanner.nextInt();
        }
        return head;
    }
    public static void printDLL(DoublyNode head) {
        System.out.print("null <--> ");
        while (head != null) {
            System.out.print(head.data);
            System.out.print(" <--> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
