package com.blz.stack;

import java.util.Scanner;

public class DataStructure {
    public static void main(String[] args) {
        Stack newStack=new Stack();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        // case for Stack Elements
        do {
            System.out.println("1.Push\n2.pop\n3.peak");
            System.out.println("Enter Choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    newStack.pushElement();
                    break;
                case 2:
                    newStack.peakElement();
                    break;
                case 3:
                    newStack.popElement();
                    break;
                default:
                    System.out.println("please enter correct option");
            }
        }while (choice != 3);
    }

}
