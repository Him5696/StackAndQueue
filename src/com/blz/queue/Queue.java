package com.blz.queue;

public class Queue {
    public int top;
    LinkedList linkedList;

    public Queue(){
        this.linkedList = new LinkedList();
    }
    public void enqueueElement(){
        linkedList.enqueue(70);
        linkedList.enqueue(30);
        linkedList.enqueue(56);
        linkedList.displayQueue();
        System.out.println();
    }
    public void peakElement() {
        linkedList.peak(70);
        linkedList.peak(30);
        linkedList.peak(56);
        top = linkedList.peak(70);
        //linkedList.displayQueue();
    }
    public void dequeueElement() {
        linkedList.dequeue(70);
        linkedList.dequeue(30);
        linkedList.dequeue(56);
        top = linkedList.dequeue(70);
        linkedList.displayQueue();
    }

}
