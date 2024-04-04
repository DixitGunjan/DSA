package org.cn.linkedlist.problems;

import org.cn.linkedlist.Node;

public class InsertatIthPositionRecursively {
    public static Node<Integer> insert(Node<Integer> head, int element, int pos) {

        if (head == null && pos > 0) {
            return head;
        }

        if (pos == 0) {
            Node<Integer> newNode = new Node<>(element);
            newNode.next = head;
            return newNode;
        } else {
            head.next = insert(head.next, element, pos - 1);
            return head;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = Node.insert();
        Node<Integer> newLL = insert(head, 40, 3);
        Node.print(newLL);
    }
}
