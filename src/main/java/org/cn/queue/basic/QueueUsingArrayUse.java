package org.cn.queue.basic;

import org.cn.queue.QueueUsingArray;
import org.cn.queue.exceptions.QueueEmptyException;
import org.cn.queue.exceptions.QueueFullException;

public class QueueUsingArrayUse {

    public static void main(String[] args) throws QueueFullException, QueueEmptyException {
        QueueUsingArray queue = new QueueUsingArray(3);

        queue.enqueue(1);
        System.out.println("Front at - " + queue.getFront());
        System.out.println("Rear at - " + queue.getRear());

        queue.enqueue(2);
        System.out.println("Front at - " + queue.getFront());
        System.out.println("Rear at - " + queue.getRear());

        queue.enqueue(3);
        System.out.println("Front at - " + queue.getFront());
        System.out.println("Rear at - " + queue.getRear());

        //queue.enqueue(3);   //to check QueueFullException

        System.out.println("Size of Queue is - " + queue.size());
        System.out.println("IS Queue Empty - " + queue.isEmpty());

        queue.dequeue();
        System.out.println("Front at - " + queue.getFront());
        System.out.println("Rear at - " + queue.getRear());

        System.out.println("Size of Queue is - " + queue.size());
        System.out.println("IS Queue Empty - " + queue.isEmpty());

        queue.print();

        /**
         queue.dequeue();
         queue.dequeue();
         queue.dequeue();
         To check QueueEmptyException
         */
    }
}
