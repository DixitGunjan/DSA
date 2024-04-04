package org.cn.linkedlist.problems;

import org.cn.linkedlist.Node;

import java.util.Scanner;

public class InsertElementAtNthPosition {

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

    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = input();
        print(head);

        insert(head, 40, 2);
    }

    public static void insert(Node<Integer> head, int data, int pos) {

        Node<Integer> newNode = new Node<>(data);

        Node<Integer> tempNode = head;
        int position = 0;

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            print(head);
            return;
        }

        while (tempNode != null && position < pos - 1)  //prevNode
        {
            tempNode = tempNode.next;
            position++;
        }

        newNode.next = tempNode.next;
        tempNode.next = newNode;

        print(head);
    }
}
