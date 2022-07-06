package com.blz.queue;

public class Queue {
    public Node top;
    LinkedList linkedList;

    public Queue(){
        this.linkedList = new LinkedList();
    }
    public void enqueue(){
        linkedList.enqueue(70);
        linkedList.enqueue(30);
        top = linkedList.enqueue(56);
        linkedList.displayQueue();
        System.out.println("\nTop -> " + top.data);
    }
}
