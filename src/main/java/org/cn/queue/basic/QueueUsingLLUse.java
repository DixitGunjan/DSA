package org.cn.queue.basic;

import org.cn.queue.QueueUsingLL;
import org.cn.queue.exceptions.QueueEmptyException;

import java.util.Scanner;

public class QueueUsingLLUse {
    public static void main(String[] args) throws QueueEmptyException {
        QueueUsingLL<Integer> queue = new QueueUsingLL<>();
        for (int i = 0; i < 5; i++) {
            queue.enqueue(new Scanner(System.in).nextInt());
        }

        System.out.println("Front - " + queue.getFront());
        queue.dequeue();
        System.out.println("Front - " + queue.getFront());

        System.out.println("IsEmpty - " + queue.isEmpty());
        System.out.println("Size - " + queue.getSize());

        System.out.println("Deleting - " + queue.dequeue());
        System.out.println("Deleting - " + queue.dequeue());
        System.out.println("Deleting - " + queue.dequeue());
        System.out.println("Deleting - " + queue.dequeue());
        System.out.println("Deleting - " + queue.dequeue());
    }
}
