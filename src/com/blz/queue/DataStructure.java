package com.blz.queue;

import java.util.Scanner;

public class DataStructure {
    public static void main(String[] args) {
        Queue newQueue = new Queue();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        // case for Queue Elements
        do {
            System.out.println("1.Enqueue\n2.Dequeue\n3.peak");
            System.out.println("Enter Choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    newQueue.enqueueElement();
                    break;
                case 2:
                    newQueue.peakElement();
                    break;
                case 3:
                    newQueue.dequeueElement();
                    break;
                default:
                    System.out.println("please enter correct option");
            }
        }while (choice != 3);
    }
}
