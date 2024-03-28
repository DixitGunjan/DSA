package org.example.linkedlist.problems;

import org.example.linkedlist.Node;

import java.util.HashSet;
import java.util.Scanner;

public class LoopINLL {

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

    public static void main(String[] args) {
        Node<Integer> head = insert();
        print(head);
        boolean ifLLHasLoop = findLoop(head);
        System.out.println("LL has loop - " + ifLLHasLoop);
    }

    private static boolean findLoop(Node<Integer> head) {
        HashSet<Node> addressSet = new HashSet<>();

        while (head != null) {
            if (addressSet.contains(head))
                return true;

            addressSet.add(head);
            head = head.next;
        }

        return false;
    }

    private static void print(Node<Integer> head) {

        Node<Integer> tempNode = head;
        while (tempNode != null) {

            System.out.println(tempNode.data);
            tempNode = tempNode.next;

        }

    }
}
