package org.leetcode.problems;

import org.cn.linkedlist.Node;

public class OddEvenLL {

    public static Node<Integer> oddEvenLL(Node<Integer> input) {
        if (input == null) {
            return null;
        }

        Node<Integer> evenHead = null, evenTail = null, oddHead = null, oddTail = null;
        int pos = 1;
        while (input != null) {
            Node<Integer> curNode = new Node<>(input.data);
            if (pos % 2 == 0) {

                if (evenHead == null) {
                    evenHead = curNode;
                    evenTail = curNode;
                } else {
                    evenTail.next = curNode;
                    evenTail = evenTail.next;
                }
            } else {
                if (oddHead == null) {
                    oddTail = curNode;
                    oddHead = curNode;
                } else {
                    oddTail.next = curNode;
                    oddTail = oddTail.next;
                }

            }
            input = input.next;
            pos++;
        }

        if (oddHead == null) {
            return evenHead;
        } else oddTail.next = evenHead;

        if (evenHead != null) evenTail.next = null;

        return oddHead;
    }

    public static void main(String[] args) {
        Node<Integer> head = Node.insert();
        Node<Integer> resultLL = oddEvenLL(head);
        Node.print(resultLL);
    }
}
