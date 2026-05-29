package org.leetcode.problems.ll;

import java.util.Scanner;

public class MiddleOfLL {
    public static void main(String[] args) {
        LinkedListNode<Integer> head = LinkedListNode.createLL();
        //LinkedListNode.printLL(head);
        System.out.println(findMiddle(head));
    }

    private static int findMiddle(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;

        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

}
