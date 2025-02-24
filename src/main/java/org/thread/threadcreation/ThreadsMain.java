package org.thread.threadcreation;

public class ThreadsMain extends Thread{

    public void run(){
        System.out.println("Thread is Running!!!");
    }
}

class Main1 {
    public static void main(String[] args) {
        ThreadsMain thread = new ThreadsMain();
        thread.start();
    }
}
