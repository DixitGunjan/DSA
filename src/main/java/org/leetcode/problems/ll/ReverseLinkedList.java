package org.leetcode.problems.ll;

import org.cn.linkedlist.Node;

import java.util.Stack;

public class ReverseLinkedList {

    public static Node<Integer> reverseLL(Node<Integer> head) {
        Node<Integer> head1 = null;

        while (head != null) {
            Node<Integer> currentNode = new Node<>(head.data);
            if (head1 == null) {
                head1 = currentNode;
            } else {
                currentNode.next = head1;
                head1 = currentNode;
            }
            head = head.next;
        }
        head = head1;
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = Node.insert();
        Node.print(reverseLL(head));
    }
}
