package org.example.linkedlist.problems;

import org.example.linkedlist.Node;

public class SwapElemtsInLL {

    public static Node<Integer> swapLL(Node<Integer> head, int i, int j) {
        if (i == j) {
            return head;
        }
        Node<Integer> currentNode = head, prev = null;
        Node<Integer> firstNode = null, firstNodePrev = null, secondNode = null, secondNodePrev = null;

        int position = 0;
        while (currentNode != null) {

            if (position == i) {
                firstNodePrev = prev;
                firstNode = currentNode;
            } else if (position == j) {
                secondNodePrev = prev;
                secondNode = currentNode;
            }
            prev = currentNode;
            position += 1;
            currentNode = currentNode.next;
        }

        //checking in case of 0th index
        if (firstNodePrev != null) {
            firstNodePrev.next = secondNode;
        } else head = secondNode;
        if (secondNodePrev != null) {
            secondNodePrev.next = firstNode;
        } else head = firstNode;

        Node<Integer> currentFirstNode = secondNode.next; //Storing next of second Node
        secondNode.next = firstNode.next;   //assigning next of first node to next of second node
        firstNode.next = currentFirstNode; //assigning next of second node to next of first node

        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = Node.insert();
        Node<Integer> result = swapLL(head, 3, 6);
        Node.print(result);
    }
}
