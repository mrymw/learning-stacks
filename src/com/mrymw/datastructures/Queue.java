package com.mrymw.datastructures;

import com.mrymw.exception.EmptyQueueException;
import com.mrymw.exception.FullQueueException;

import java.util.Arrays;

public class Queue <E> {
    int capacity;
    E[] queue;
    int frontIndex; //index of the first element
    int rearIndex; //index of the next element

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = (E[]) new Object[capacity];
        frontIndex = rearIndex = 0;}
    public int size(){return (capacity - frontIndex + rearIndex) % capacity;}
    public boolean isEmpty() {return (frontIndex == rearIndex);}
    public E front() throws EmptyQueueException {
        if(isEmpty()) {throw  new EmptyQueueException("Queue is EMPTY!");}
        return queue[frontIndex];
    }
    public void enqueue(E element) throws FullQueueException {
        if(size() == capacity -1) throw new FullQueueException("Queue is FULL!");
        queue[rearIndex] = element;
        rearIndex = (rearIndex + 1) % capacity;
    }
    public E dequeue() throws EmptyQueueException {
        if(isEmpty()) throw new EmptyQueueException("Queue is EMPTY!");
        E temp = queue[frontIndex];
        queue[frontIndex] = null;
        frontIndex = (frontIndex + 1) % capacity;
        return temp;
    }

    @Override
    public String toString() {
        int index = frontIndex;
        StringBuilder stringBuilder = new StringBuilder("[");
        if(size()>0) stringBuilder.append(queue[index].toString());
        if(size()>1) {
            index++;
            while (index!= rearIndex) {
                stringBuilder.append(", ").append(queue[index].toString());
                index = (index + 1) % capacity;
            }
        }
        return stringBuilder + "]";
    }
}
