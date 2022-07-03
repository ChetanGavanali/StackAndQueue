package com.bridgelabz;

import java.util.Scanner;

public class StackAndQueueMain {
    public static void main(String[] args) {
        System.out.println("Welcome to StackAndQueue Data Structure Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Press '1' to add element at the start ");
        System.out.println("Press '2' to peek the element");
        System.out.println("Press '3' to pop the element");
        System.out.println("Press '4' to add element in the Queue");
        System.out.println("Press '5' to dequeue element");
        switch (sc.nextInt()) {
            case 1:
                Operation.addElement();
                break;
            case 2:
                Operation.peek();
                break;
            case 3:
                Operation.pop();
                break;
            case 4:
                Operation.queueElement();
                break;
            case 5:
                Operation.dequeueElement();
                break;
            default: {
                System.out.println("Press Valid Key");

            }
        }
    }
}
