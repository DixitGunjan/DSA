package org.example.linkedlist;

import java.util.Scanner;

public class Node<T> {

    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public static Node<Integer> insert() {

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        Node<Integer> head = null, tail = null;

        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);
            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                tail.next = currentNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }

        return head;
    }

    public static void print(Node<Integer> head) {

        Node<Integer> tempNode = head;
        while (tempNode != null) {

            System.out.println(tempNode.data);
            tempNode = tempNode.next;

        }

    }
}
