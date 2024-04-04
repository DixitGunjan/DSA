package org.cn.linkedlist.problems;

import org.cn.linkedlist.Node;

import java.util.Scanner;

public class InsertRecursivelyIntoLL {

    static Node<Integer> head = null, tail = null;

    public static void insert() {

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        if (data == -1) return;
        Node<Integer> currentNode = new Node<>(data);
        if (head == null) {
            head = currentNode;
            tail = currentNode;
        }
        tail.next = currentNode;
        tail = tail.next;

        insert();
    }

    public static void main(String[] args) {
        insert();
        Node.print(head);
    }
}
