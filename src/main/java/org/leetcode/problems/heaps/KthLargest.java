package org.leetcode.problems.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

//Min-heap
public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int K = 4;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int n : arr) {
            pq.add(n);

            if (pq.size() > K) {
                pq.poll();
            }
        }

        System.out.println(pq.peek());
    }
}
