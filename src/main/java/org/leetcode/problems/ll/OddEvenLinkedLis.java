package org.leetcode.problems.ll;

public class OddEvenLinkedLis {
    public static void main(String[] args) {
        LinkedListNode<Integer> head = LinkedListNode.createLL();
        segregate(head);
        LinkedListNode.printLL(head);
    }

    private static void segregate(LinkedListNode<Integer> head) {
        if(head == null || head.next == null) return;
        LinkedListNode<Integer> odd = head;
        LinkedListNode<Integer> even = head.next;
        LinkedListNode<Integer> evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
    }
}
