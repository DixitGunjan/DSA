package org.cn.linkedlist.problems;

import org.cn.linkedlist.Node;

public class EvenAfterOddLL {

    public static Node<Integer> evenAfterOddLL(Node<Integer> head) {

        Node<Integer> evenHead = null, evenTail = null, oddHead = null, oddTail = null;

        while (head != null) {

            if (head.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = head;
                    evenTail = head;
                } else {
                    evenTail.next = head;
                    evenTail = evenTail.next;
                }
            } else {
                if (oddHead == null) {
                    oddHead = head;
                    oddTail = head;
                } else {
                    oddTail.next = head;
                    oddTail = oddTail.next;
                }
            }
            head = head.next;

        }
        //Checking if oddHead is null then Directly return even list
        if (oddHead == null) {
            return evenHead;
        } else {
            oddTail.next = evenHead;
        }

        //Making Eventail point to null as this would be the tail of new LL
        if (evenHead != null) evenTail.next = null;

        return oddHead;

    }

    public static void main(String[] args) {
        Node<Integer> head = Node.insert();
        Node<Integer> resultLL = evenAfterOddLL(head);
        Node.print(resultLL);
    }
}
