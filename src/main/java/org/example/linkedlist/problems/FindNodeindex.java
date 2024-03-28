package org.example.linkedlist.problems;

import org.example.linkedlist.Node;

import java.util.Scanner;

public class FindNodeindex {

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
        //print(head);

        find(head, 30);
    }

    public static void find(Node<Integer> head, int data) {

        Node<Integer> tempNode = head;
        int pos = 0;
        while (tempNode != null) {
            if (tempNode.data == data) {
                System.out.println("find at pos - " + pos);
                break;
            }

            tempNode = tempNode.next;
            pos++;

        }
    }
}
