package org.cn.linkedlist.problems;

import org.cn.linkedlist.Node;

public class FindANodeinLLRecursive {

    static int position = 0;

    public static int findNode(Node<Integer> head, int data) {

        if (head == null) {
            return -1;
        }
        if (head.data.equals(data)) {
            return position;
        } else {
            position++;
        }
        return findNode(head.next, data);

    }

    public static void main(String[] args) {

        Node<Integer> head = Node.insert();
        System.out.println(findNode(head, 30));

    }
}
