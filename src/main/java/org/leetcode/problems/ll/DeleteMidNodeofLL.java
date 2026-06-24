package org.leetcode.problems.ll;

public class DeleteMidNodeofLL {
    public static void main(String[] args) {
        LinkedListNode<Integer> head = LinkedListNode.createLL();
        deleteMidNode(head);
        LinkedListNode.printLL(head);
    }

    private static void deleteMidNode(LinkedListNode<Integer> head) {
        if(head == null || head.next == null) {
            return;
            //return null;
        }
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        LinkedListNode<Integer> prev = null;

        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;
    }
}
