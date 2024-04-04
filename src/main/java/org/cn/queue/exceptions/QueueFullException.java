package org.cn.queue.exceptions;

public class QueueFullException extends Exception {
    public QueueFullException(String msg) {
        super(msg);
    }
}
