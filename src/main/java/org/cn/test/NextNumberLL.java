package org.cn.test;

import org.cn.linkedlist.Node;

import java.math.BigInteger;

public class NextNumberLL {

    private static Node<Integer> nextNumber(Node<Integer> head) {
        StringBuilder numberString = new StringBuilder();
        Node<Integer> tail = null;
        if (head == null)
            return head;
        Node<Integer> zeroNode = null;
        boolean flag = false;
        if (head.data == 0) {
            zeroNode = new Node<>(0);
            flag = true;
        }
        while (head != null) {
            numberString.append(head.data);
            head = head.next;
        }
        System.out.println(numberString);
        BigInteger number = new BigInteger(numberString.toString().trim());
        number = number.add(BigInteger.valueOf(1));
        String resultString = String.valueOf(number);

        for (int i = 0; i < resultString.length(); i++) {

            Node<Integer> tempNode = new Node<>(Integer.parseInt(String.valueOf(resultString.charAt(i))));
            if (head == null) {
                if (flag) {
                    head = zeroNode;
                    tail = zeroNode;
                    tail.next = tempNode;
                    tail = tail.next;
                } else {
                    head = tempNode;
                    tail = tempNode;
                }
            } else {
                tail.next = tempNode;
                tail = tail.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = Node.insert();
        head = nextNumber(head);
        Node.print(head);
    }
}