package org.example.linkedlist.basic;

public class PrintGivenNode {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(-1);
        Node<Integer> n2 = new Node<>(4);
        Node<Integer> n3 = new Node<>(12);
        Node<Integer> n4 = new Node<>(7);

       /** n1.next = n2;
        n2.next = n3;
        n3.next = n4; */

        print(n1, 0);
    }

    private static void print(Node<Integer> head, int i) {
        int position = 0;

        Node<Integer> temp = head;

        while(temp != null && position < i) {
            temp =temp.next;
            position++;
        }

        if(temp!=null){
            System.out.println(temp.data);
        }
    }
}
