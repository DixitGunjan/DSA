package org.cn.queue.basic;

import org.cn.queue.QueueUsingTwoStacks;
import org.cn.queue.exceptions.QueueEmptyException;

public class QueueUsingTwoStacksUse {
    public static void main(String[] args) throws QueueEmptyException {
        QueueUsingTwoStacks<Integer> queue = new QueueUsingTwoStacks<>();

        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
        }
        System.out.println("Front - " + queue.front());
        queue.dequeue();
        System.out.println("Front - " + queue.front());

        System.out.println("IsEmpty - " + queue.isEmpty());
        System.out.println("Size - " + queue.getSize());

        System.out.println("Deleting - " + queue.dequeue());
        System.out.println("Deleting - " + queue.dequeue());
        System.out.println("Deleting - " + queue.dequeue());
        System.out.println("Deleting - " + queue.dequeue());
        System.out.println("Deleting - " + queue.dequeue());
    }
}
