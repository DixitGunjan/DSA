package org.cn.linkedlist.problems;

import org.cn.linkedlist.basic.Node;
import org.cn.linkedlist.basic.TakingCustomInput;

import java.util.Scanner;

public class RotateLL {
    public static void main(String[] args) {
        Node<Integer> head = TakingCustomInput.takeInput();
        int k = new Scanner(System.in).nextInt();

        for (int i = 0; i < k; i++) {
            Node<Integer> currNode = head;

            while (currNode.next != null) {
                currNode = currNode.next;
            }

            currNode.next = head;
            currNode = currNode.next;
            head = head.next;
            currNode.next = null;
        }

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}
