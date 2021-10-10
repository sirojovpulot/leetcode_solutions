package com.pulot.datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class Queue<T> implements Iterable<T> {
    private LinkedList<T> list = new LinkedList<>();

    public Queue() {
    }

    public Queue(T e) {
        offer(e);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Queue empty");
        return list.peekFirst();
    }

    public T poll() {
        if (isEmpty()) throw new RuntimeException("Queue empty");
        return list.removeFirst();
    }

    public void offer(T e) {
        list.addLast(e);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
