package org.leetcode.problems.ll;

import java.util.HashSet;
import java.util.Set;

public class FindIntersectionNode {
    public static void main(String[] args) {
        LinkedListNode<Integer> head = LinkedListNode.createLL();
        LinkedListNode<Integer> head2 = LinkedListNode.createLL();
        System.out.println(findIntersection(head, head2));

    }

    private static int findIntersection(LinkedListNode<Integer> head, LinkedListNode<Integer> head2) {
        int result  =0;
        Set<LinkedListNode<Integer>> first = new HashSet<>();

        while(head!=null){
            first.add(head);
            head = head.next;
        }
        while(head2!=null){
            if(first.contains(head2)){
                result = head2.data;
                break;
            }
            head2 = head2.next;
        }
        return result;
    }
}
