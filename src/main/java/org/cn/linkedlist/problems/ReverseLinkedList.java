package org.cn.linkedlist.problems;

import org.cn.linkedlist.Node;

import java.util.Scanner;

public class ReverseLinkedList {
    public static Node<Integer> input() {

        Node<Integer> head = null, tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

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


    public static void main(String[] args) {
        Node<Integer> head = input();
        //print(head);

        reverse(head);
    }

    private static void reverse(Node<Integer> head) {
        if (head == null) {
            return;
        }
        reverse(head.next);
        System.out.println(head.data);
    }
}
