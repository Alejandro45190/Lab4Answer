
package com.mycompany.datastructures;


public class Queue {
    
    private final int[] values;
    private int head; //point to first element of queue
    private int tail; //point to the element after last
    private int elements;
        
    public Queue(int size) {
        values = new int[size];
    }
    
    public void append(int value) {
        if (elements == values.length)
        {
            throw new QueueException("Queue is full");
        }
        values[tail] = value;
        tail = (tail + 1) % values.length;
        elements++;
    }
    
    public int get() {
        if (elements == 0) {
            throw new QueueException("Queue is empty");
        }
        int v = values[head];
        head = (head + 1) % values.length;
        elements--;
        return v;
    }
    
    public boolean isEmpty(){
        return elements == 0;
    }
    
    public boolean isFull() {
        return elements == values.length;
    }    
}
