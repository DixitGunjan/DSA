package org.leetcode.problems.ll;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DetectLLCycle {
    public static void main(String[] args) {

    }

    private static int cycleIndex(LinkedListNode<Integer> head) {
        Map<LinkedListNode<Integer>, Integer> indexMap = new HashMap<>();
        Set<LinkedListNode<Integer>> nodeSet = new HashSet<>();
        int i = 0;
        while (head != null) {
            if (indexMap.containsKey(head)) {
                LinkedListNode<Integer> nextNode = head.next;
                return indexMap.get(nextNode);
            } else {
                nodeSet.add(head);
                indexMap.put(head, i);
            }
            head = head.next;
            i++;
        }
        return -1;
    }
}
