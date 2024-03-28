package org.example.linkedlist.problems;

import org.example.linkedlist.Node;

import java.util.Scanner;

public class AppenLastNtoFirst {
    public static Node<Integer> input() {

        Node<Integer> head = null, tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data != -1) {

            Node<Integer> currentNode = new Node<>(data);

            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                tail.next = currentNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }

        return head;
    }

    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = input();
        //print(head);

        append(head, 3);
        append2(head, 3);
    }

    private static void append2(Node<Integer> head, int i) {

        
    }

    public static int length(Node<Integer> head){
        Node<Integer> temp = head;
        int count =0;
        while(temp!=null){
            count++;
            temp = temp.next;

        }
        return count;
    }

    public static void append(Node<Integer> head , int pos) {

        if(pos ==0 || head == null) {
            print(head);
            return;
        }
        int len = length(head);
        Node<Integer> newFirstNode = head;
        Node<Integer> newLastNode = head;
        Node<Integer> actualLAst = head;

        for(int i =0;i < len - pos;i++){
            if(i == (len - pos - 1 ))
                 newLastNode = newFirstNode;

            newFirstNode = newFirstNode.next;

        }

        Node<Integer> temp = newFirstNode;
        while(temp != null){
            actualLAst = temp;
            temp = temp.next;
        }

        actualLAst.next = head;
        newLastNode.next = null;
        head = newFirstNode;

        print(head);

    }
}
