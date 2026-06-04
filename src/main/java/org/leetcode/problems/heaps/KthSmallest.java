package org.leetcode.problems.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

//Max-heap
public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int K = 4;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int n : arr) {
            pq.add(n);

            if (pq.size() > K) {
                pq.poll();
            }
        }

        System.out.println(pq.peek());
    }
}
