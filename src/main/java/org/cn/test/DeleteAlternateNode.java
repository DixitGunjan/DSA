package org.cn.test;

import org.cn.linkedlist.Node;

public class DeleteAlternateNode {
    public static Node<Integer> deleteAltNode(Node<Integer> head) {
        Node<Integer> temp = head;
        Node<Integer> next = temp.next;
        if (temp == null || temp.next == null) {
            return temp;
        }
        while (temp != null && next != null) {
            temp.next = next.next;
            temp = temp.next;
            if (temp != null) {
                next = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = Node.insert();
        Node<Integer> head1 = deleteAltNode(head);
        Node.print(head1);
    }
}
