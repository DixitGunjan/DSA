package org.cn.linkedlist.problems;

import org.cn.linkedlist.Node;

public class DeleteAtIthPositionRecusriveLL {

    public static Node<Integer> deleteAt(Node<Integer> head, int pos) {

        if (head == null) {
            return head;
        }

        if (pos == 0) {
            Node<Integer> newNode = head.next;
            return newNode;
        } else {
            Node<Integer> newLL = deleteAt(head.next, pos - 1);
            head.next = newLL;
            return head;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = Node.insert();
        Node<Integer> finalLL = deleteAt(head, 9);
        Node.print(finalLL);
    }
}
