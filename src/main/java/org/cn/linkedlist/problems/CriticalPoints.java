package org.cn.linkedlist.problems;

import org.cn.linkedlist.basic.Node;
import org.cn.linkedlist.basic.TakingCustomInput;

/**
 * Critical points in a Linked List
 * Given the head of a linked list, Find the number of critical points. (The starting and end are not considered critical points).
 * <p>
 * Local minima or maxima are called critical points.
 * <p>
 * A Node is called a local minima if both next and previous elements are greater than the current element.
 * <p>
 * A Node is called a local maxima if both next and previous elements are smaller than the current element.
 */
public class CriticalPoints {

    public static void main(String[] args) {
        Node<Integer> node = TakingCustomInput.takeInput();
        int count = 0;

        Node<Integer> temp = node.next;
        Node<Integer> previous = node;

        while (temp.next != null) {

            if ((previous.data > temp.data && temp.next.data > temp.data) || (previous.data < temp.data && temp.next.data < temp.data))
                count++;
            previous = temp;
            temp = temp.next;
        }
        System.out.println(count);
    }
}
