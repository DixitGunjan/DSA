package org.cn.linkedlist.problems;

import org.cn.linkedlist.Node;

import java.util.HashSet;

import static org.cn.linkedlist.Node.insert;
import static org.cn.linkedlist.Node.print;

public class LoopINLL {

    public static void main(String[] args) {
        Node<Integer> head = insert();
        print(head);
        boolean ifLLHasLoop = findLoop(head);
        System.out.println("LL has loop - " + ifLLHasLoop);
    }

    private static boolean findLoop(Node<Integer> head) {
        HashSet<Node> addressSet = new HashSet<>();

        while (head != null) {
            if (addressSet.contains(head))
                return true;

            addressSet.add(head);
            head = head.next;
        }

        return false;
    }
}
