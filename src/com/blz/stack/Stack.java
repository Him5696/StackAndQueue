package com.blz.stack;

public class Stack {
    public Node top;
    LinkedList linkedList;

    public Stack() {
        this.linkedList = new LinkedList();
    }
    public void push() {
        linkedList.push(70);
        linkedList.push(30);
        top = linkedList.push(56);
        linkedList.print();
        System.out.println("Top -> " + top.data);
    }
}
