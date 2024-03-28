package org.example.linkedlist.problems;

import org.example.linkedlist.Node;

import static org.example.linkedlist.Node.insert;

public class PrintLLRecursive {
    public static void main(String[] args) {
        Node<Integer> head = insert();

        printRecursive(head);
    }

    private static void printRecursive(Node<Integer> head) {
        if (head == null) return;

        System.out.println(head.data);
        printRecursive(head.next);
    }
}
