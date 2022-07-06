package com.blz.stack;

public class LinkedList {
    Node head;
    Node tail;

    public Node push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
        } else {
            tail.next = newNode;
        }
        this.tail = newNode;
        return newNode;
    }

    public void print() {
        Node newNode = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (newNode != null) {
                if (newNode.next != null) {
                    System.out.print(newNode.data + "->");
                } else
                    System.out.println(newNode.data);
                newNode = newNode.next;
            }
        }
    }
}
