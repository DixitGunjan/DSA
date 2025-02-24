package org.thread.threadcreation;

public class RunnableThread implements Runnable{
    @Override
    public void run() {
        System.out.println("thread is running!!!!");
    }
}

class Main{
    public static void main(String[] args) {
        RunnableThread thread = new RunnableThread();
        Thread t1 = new Thread(thread);
        t1.start();
    }
}
