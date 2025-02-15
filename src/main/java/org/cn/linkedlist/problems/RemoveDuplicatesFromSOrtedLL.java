package org.cn.linkedlist.problems;

import org.cn.linkedlist.basic.Node;
import org.cn.linkedlist.basic.TakingCustomInput;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSOrtedLL {
    public static void main(String[] args) {
        Node<Integer> node = TakingCustomInput.takeInput();

        Set<Integer> set = new HashSet<>();

        Node<Integer> temp = node;
        Node<Integer> newHead = null;
        Node<Integer> newtail = null;
        while (temp != null) {
            Node<Integer> newNode = new Node<>(temp.data);
            if (!set.contains(temp.data)) {

                if (newHead == null) {
                    newHead = newNode;
                    newtail = newNode;
                } else {
                    newtail.next = newNode;
                    newtail = newNode;
                }
            }
            set.add(temp.data);
            temp = temp.next;
        }

        TakingCustomInput.print(newHead);
    }
}
