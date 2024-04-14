package org.leetcode.problems;

import org.cn.linkedlist.Node;

public class DeleteMiddleNodeofLL {

    public static Node<Integer> deleteMiddle(Node<Integer> head) {

        int length = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        System.out.println("lenght of LL is -" + length);

        Node<Integer> tempHead2 = head;
        Node<Integer> prev = null;


        if (tempHead2 == null) return null;

        for (int i = 0; i <= length / 2; i++) {
            if (i == length / 2 ) {
                prev.next = tempHead2.next;
                prev = prev.next;

            }
            prev = tempHead2;
            tempHead2 = tempHead2.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = Node.insert();
        Node.print(deleteMiddle(head));

    }
}
