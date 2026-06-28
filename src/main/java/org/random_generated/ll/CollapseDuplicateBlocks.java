package org.random_generated.ll;

import org.cn.linkedlist.Node;

public class CollapseDuplicateBlocks {
    void main() {
        Node<Integer> list = Node.insert();
        list = collapseDuplicateBlocks(list);
        Node.print(list);
    }

    private Node<Integer> collapseDuplicateBlocks(Node<Integer> list) {
        Node<Integer> curr = list;

        while (curr != null) {
            int value = curr.data;
            int count = 0;
            Node<Integer> temp = curr;

            while (temp != null && temp.data == value) {
                count++;
                temp = temp.next;
            }
            curr.data = value * count;
            curr.next = temp;
            curr = temp;
        }
        return list;
    }
}
