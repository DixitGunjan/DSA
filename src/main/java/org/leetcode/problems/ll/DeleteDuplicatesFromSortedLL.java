package org.leetcode.problems.ll;

import java.util.Set;

public class DeleteDuplicatesFromSortedLL {
    void main() {
        LinkedListNode<Integer> head = LinkedListNode.createLL();
        head = removeDuplciates(head);
        LinkedListNode.printLL(head);
    }

        public LinkedListNode<Integer> removeDuplciates(LinkedListNode<Integer> head) {
            if (head == null || head.next == null) {
                return head;
            }

            // Dummy node to handle edge case where head is duplicated
            LinkedListNode<Integer> dummy = new LinkedListNode<Integer>(0);
            dummy.next = head;

            LinkedListNode<Integer> prev = dummy;
            LinkedListNode<Integer> current = head;

            while (current != null && current.next != null) {
                // Check if current node has duplicates
                if (current.data == current.next.data) {
                    int duplicateValue = current.data;

                    // Skip all nodes with this duplicate value
                    while (current != null && current.data == duplicateValue) {
                        current = current.next;
                    }

                    // Connect prev to the next non-duplicate node
                    prev.next = current;
                } else {
                    // No duplicate, move prev forward
                    prev = current;
                    current = current.next;
                }
            }

            return dummy.next;
        }
    }

