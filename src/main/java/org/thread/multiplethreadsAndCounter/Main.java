package org.thread.multiplethreadsAndCounter;

public class  Main {

    public static void main(String[] args) {
        Counter counter = new Counter();
        int incrementThread = 1000;
        MainThread[] numThread = new MainThread[6];
        for (int i = 0; i < 6; i++) {
            numThread[i] = new MainThread(counter, incrementThread);
            numThread[i].start();
        }

        try {
            for (MainThread thread : numThread) {
                thread.join();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.getCount());
    }
}
