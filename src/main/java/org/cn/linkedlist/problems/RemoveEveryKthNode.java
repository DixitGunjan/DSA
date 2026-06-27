package org.cn.linkedlist.problems;

import org.cn.linkedlist.Node;
import org.leetcode.problems.ll.LinkedListNode;

public class RemoveEveryKthNode {
    void main() {
        Node<Integer> list = Node.insert();

        int k = 3;
        list = removeEveryKth(list, k);
        Node.print(list);


    }

    private Node<Integer> removeEveryKth(Node<Integer> list, int k) {
        if (list == null || k == 1) {
            return null;
        }
        Node<Integer> cur = list;
        Node<Integer> dummy = cur;
        Node<Integer> prev = null;
        int count = 1;
        while (dummy != null) {
            if (count % k == 0) {
                prev.next = dummy.next;

            } else {
                prev = dummy;

            }
            dummy = dummy.next;
            count++;
        }
        return cur;
    }
}
