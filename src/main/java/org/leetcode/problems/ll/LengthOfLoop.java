package org.leetcode.problems.ll;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLoop {
    public static void main(String[] args) {
        LinkedListNode<Integer> head = LinkedListNode.createLL();
        System.out.println(findLoopLength(head));
    }

    private static int findLoopLength(LinkedListNode<Integer> head) {
        Map<LinkedListNode<Integer>, Integer> indexMap = new HashMap<>();
        int i = 0;
        while (head != null) {
            if (indexMap.containsKey(head)) {
                return i - indexMap.get(head);
            }
            indexMap.put(head, i);
            i++;
            head = head.next;
        }
        return 0;
    }
}
