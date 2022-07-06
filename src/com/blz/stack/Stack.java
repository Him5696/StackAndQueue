package com.blz.stack;

public class Stack {
    public Node top;
    LinkedList linkedList;

    public Stack() {
        this.linkedList = new LinkedList();
    }
    public void pushElement() {
        linkedList.push(70);
        linkedList.push(30);
        top = linkedList.push(56);
        linkedList.print();
        System.out.println("Top -> " + top.data);
    }
    public void peakElement() {
        linkedList.push(70);
        linkedList.push(30);
        top = linkedList.peak();
        linkedList.print();
        System.out.println("Top ->" + top.data);
    }
    public void popElement() {
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        top = linkedList.pop();
        System.out.println("Top - > " + top.data);
        linkedList.print();
    }
}
