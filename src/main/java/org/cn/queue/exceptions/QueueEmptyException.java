package org.cn.queue.exceptions;

public class QueueEmptyException extends Exception {
    public QueueEmptyException(String msg) {
        super(msg);
    }
}
