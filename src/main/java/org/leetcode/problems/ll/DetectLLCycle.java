package org.leetcode.problems.ll;

import java.util.HashSet;
import java.util.Set;

public class DetectLLCycle {
    public static void main(String[] args) {

    }

    private static LinkedListNode<Integer> cycleIndex(LinkedListNode<Integer> head) {
        Set<LinkedListNode<Integer>> indexMap = new HashSet<>();
        int i = 0;
        while (head != null) {
            if (indexMap.contains(head)) {
                return head;
            }
            indexMap.add(head);
            head = head.next;
            i++;
        }
        return null;
    }
}
