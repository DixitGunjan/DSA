package org.leetcode.problems.ll.dll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairSumEqualsTarget {
    public static void main(String[] args) {
        DoublyNode head = DoublyNode.createDLL();
        System.out.println(findPairSums(head, 7));
        DoublyNode.printDLL(head);
    }

    private static List<List<Integer>> findPairSums(DoublyNode head, int k) {
        Map<Integer, DoublyNode> map = new HashMap<>();
        List<List<Integer>> pairList = new ArrayList<>();

        while (head != null) {
            int currData = head.data;
            int required = k - currData;
            if (map.containsKey(required)) {
                List<Integer> list = new ArrayList<>();
                list.add(required);
                list.add(currData);
                pairList.add(list);
            } else {
                map.put(currData, head);
            }
            head = head.next;
        }
        return pairList;
    }
}
