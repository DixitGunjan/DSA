package org.example.linkedlist.problems;

import org.example.linkedlist.Node;

public class MergeTwoSortedLL {

    public static Node<Integer> merge(Node<Integer> list1, Node<Integer> list2) {
        Node<Integer> tempNode1 = list1, tempNode2 = list2;
        Node<Integer> head, tail;

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (tempNode1.data <= tempNode2.data) {
            head = tempNode1;
            tail = tempNode1;
            tempNode1 = tempNode1.next;
        } else {
            head = tempNode2;
            tail = tempNode2;
            tempNode2 = tempNode2.next;
        }

        while (tempNode1 != null && tempNode2 != null) {
            if (tempNode1.data <= tempNode2.data) {
                tail.next = tempNode1;
                tail = tempNode1;
                tempNode1 = tempNode1.next;
            } else {
                tail.next = tempNode2;
                tail = tempNode2;
                tempNode2 = tempNode2.next;
            }
        }

        if (tempNode1 != null) {
            tail.next = tempNode1;
        } else {
            tail.next = tempNode2;
        }

        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head1 = Node.insert();
        Node<Integer> head2 = Node.insert();
        Node<Integer> resultLL = merge(head1, head2);
        Node.print(resultLL);
    }
}
