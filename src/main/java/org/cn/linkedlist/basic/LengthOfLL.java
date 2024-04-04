package org.cn.linkedlist.basic;

public class LengthOfLL {

    public static int length(Node<Integer> head) {
        Node<Integer> temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;

        }
        return count;
    }

    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(5);
        Node<Integer> n2 = new Node<>(4);
        Node<Integer> n3 = new Node<>(12);
        Node<Integer> n4 = new Node<>(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println(length(n1));
    }
}
