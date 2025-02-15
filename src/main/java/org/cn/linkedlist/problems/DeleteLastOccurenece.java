package org.cn.linkedlist.problems;

import org.cn.linkedlist.basic.Node;
import org.cn.linkedlist.basic.TakingCustomInput;

import java.util.Scanner;

public class DeleteLastOccurenece {

    public static void main(String[] args) {
        Node<Integer> head = TakingCustomInput.takeInput();
        Node<Integer> lastPrev = null, last = null;
        Node<Integer> temp = head, prev = null;
        int k = new Scanner(System.in).nextInt();

        while (temp != null) {
            if (temp.data == k) {
                lastPrev = prev;
                last = temp;
            }
            prev = temp;
            temp = temp.next;
        }

        if (last != null) {
            if (lastPrev != null) {
                lastPrev.next = last.next;
            } else
                head = head.next;

        }
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}
