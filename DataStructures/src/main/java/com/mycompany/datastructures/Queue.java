
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
        values[tail] = value;
        tail = (tail + 1) % values.length;
        elements++;
    }
    
    public int get() {
        int v = values[head];
        head = (head + 1) % values.length;
        elements--;
        return v;
    }
    
    public int peek() { //returns element of queue but not delete it
        return values[head];
    }
    
    public boolean isEmpty(){
        return elements == 0;
    }
    
    public boolean isFull() {
        return elements == values.length;
    }    
}
