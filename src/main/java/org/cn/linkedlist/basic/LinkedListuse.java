package org.cn.linkedlist.basic;

public class LinkedListuse {

    Node<Integer> head;

    public static void print(Node<Integer> head) {

        Node<Integer> temp = head;

        System.out.print("head ->");

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.print("tail");

    }

    public static void main(String[] args) {

        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        Node<Integer> n5 = new Node<>(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        print(n1);


    }
}
