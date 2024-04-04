package org.leetcode.problems;

import org.cn.linkedlist.Node;

public class TwoSum {

    public static Node<Integer> twoSum(Node<Integer> list1, Node<Integer> list2) {

        Node<Integer> head = null, tail = null;

        StringBuilder data1 = new StringBuilder();
        StringBuilder data2 = new StringBuilder();

        while (list1 != null) {
            data1.append(list1.data);
            list1 = list1.next;

        }
        while (list2 != null) {
            data2.append(list2.data);
            list2 = list2.next;
        }
        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);

        data1 = data1.reverse();
        data2 = data2.reverse();

        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);

        int resultForList = Integer.parseInt(data1.toString()) + Integer.parseInt(data2.toString());
        StringBuilder resultForList1 = new StringBuilder("" + resultForList); // or toString()
        resultForList1 = resultForList1.reverse();

        for (int i = 0; i < resultForList1.length(); i++) {
            Node<Integer> currentNode = new Node<>(Integer.parseInt(String.valueOf(resultForList1.charAt(i))));

            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                tail.next = currentNode;
                tail = tail.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Node<Integer> list1 = Node.insert();
        Node<Integer> list2 = Node.insert();

        Node.print(twoSum(list1, list2));
    }
}
