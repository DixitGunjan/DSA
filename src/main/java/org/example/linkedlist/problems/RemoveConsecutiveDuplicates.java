package org.example.linkedlist.problems;

import org.example.linkedlist.Node;

import java.util.Objects;
import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
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

        remove(head);
    }

    private static void remove(Node<Integer> head) {

        Node<Integer> tempHead = head;

        while(tempHead.next != null){
            if(tempHead.data.equals(tempHead.next.data)){
                tempHead.next = tempHead.next.next;
            }
            else {
                tempHead = tempHead.next;
            }
        }

        print(head);
    }
}
