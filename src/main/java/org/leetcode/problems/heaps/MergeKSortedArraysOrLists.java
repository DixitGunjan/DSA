package org.leetcode.problems.heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedArraysOrLists {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(List.of(1, 2, 3, 4));
        lists.add(List.of(1, 3, 5, 7));
        lists.add(List.of(2, 4, 6, 8));

        System.out.println(merge(lists));
    }

    public static List<Integer> merge(List<List<Integer>> lists) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (List<Integer> list : lists) {
            pq.addAll(list);
        }
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }
        return result;
    }
}
