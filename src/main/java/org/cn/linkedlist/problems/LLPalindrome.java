package org.cn.linkedlist.problems;

import org.cn.linkedlist.basic.Node;
import org.cn.linkedlist.basic.TakingCustomInput;

import java.util.Objects;
import java.util.Stack;

public class LLPalindrome {

    public static void main(String[] args) {
        Node<Integer> head = TakingCustomInput.takeInput();
        Node<Integer> temp = head;
        Stack<Integer> intStack = new Stack<>();

        while (temp != null) {
            intStack.push(temp.data);
            temp = temp.next;
        }
        boolean flag = true;
        while (head != null) {

            if (!Objects.equals(head.data, intStack.pop())) {
                flag = false;
            }
            head = head.next;
        }
        if (flag)
            System.out.println("Plaindrome");
        else System.out.println("Not palindorme");

    }
}
