package com.blz.queue;

public class LinkedList {
        Node head = null;
        Node temp = null;

        public  boolean isEmpty() {
            return head == null & temp == null;
        }
        public Node enqueue(int data) {
            Node newNode = new Node(data);

            if (temp == null) {
                temp = head = newNode;
                return newNode;
            }

            temp.next = newNode;
            temp = newNode;

            return newNode;
        }

        public void displayQueue() {
            Node newNode = head;
            while (newNode != null) {
                System.out.print(newNode.data + " ");
                newNode = newNode.next;
            }
        }
    public int dequeue(int data) {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int front = head.data;

        if (head == temp) {
            temp = null;
        }
        head = head.next;
        return front;
    }
    public int peak(int data) {
        if (isEmpty()) {
            System.out.println("Empty queue");
            return -1;
        }
        return head.data;
    }

}
