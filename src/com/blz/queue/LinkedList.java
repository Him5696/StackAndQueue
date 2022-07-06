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
}
