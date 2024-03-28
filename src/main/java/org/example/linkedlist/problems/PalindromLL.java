package org.example.linkedlist.problems;

import org.example.linkedlist.Node;

import java.util.Scanner;

public class PalindromLL {
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


    public static void main(String[] args) {
        Node<Integer> head = input();
        boolean result = checkPaLL(head);
        System.out.println("Given LL is PDM - " + result);


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
    private static boolean checkPaLL(Node<Integer> head) {
       boolean flag = false;
        if(head == null) return flag;

        int length = length(head);

        if(length%2 !=0) return flag;

        Node<Integer> secondHalf = head;
        Node<Integer> temp = head;

        for(int i =0; i< length/2 + 1 ;i++){
            secondHalf = temp;
            temp = temp.next;
        }

        while(head != null && secondHalf != null) {
            if (head.data == secondHalf.data) flag = true;

            System.out.println("head - " + head.data + " second half -" + secondHalf.data);
            head = head.next;
            secondHalf = secondHalf.next;
        }

        return flag;
    }
}
