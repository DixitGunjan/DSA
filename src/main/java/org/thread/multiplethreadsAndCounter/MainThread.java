package org.thread.multiplethreadsAndCounter;

public class MainThread extends Thread {

    private Counter counter;
    private int incrementPerThread;

    MainThread(Counter counter, int incrementPerThread) {
        this.counter = counter;
        this.incrementPerThread = incrementPerThread;
    }

    @Override
    public void run() {
        for (int i = 0; i < incrementPerThread; i++) {
            counter.increament();
        }
    }


}

class Counter {
    int count = 0;

    public void increament() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
