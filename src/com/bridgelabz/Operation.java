package com.bridgelabz;

public class Operation {
    public static StackAndQueue addElement() {

        StackAndQueue stacklist = new StackAndQueue();
        stacklist.push(70);
        stacklist.push(30);
        stacklist.push(56);

        stacklist.display();
        return stacklist;
    }

    public static void peek() {
        StackAndQueue stacklist = new StackAndQueue();
        stacklist.push(70);
        stacklist.push(30);
        stacklist.push(56);
        stacklist.peek();
    }

    public static void pop() {
        System.out.println(" Before Pop:");
        StackAndQueue stacklist = addElement();
        stacklist.poptillend();
        System.out.println(" After Pop:");
        stacklist.display();
    }

    public static void queueElement() {
        StackAndQueue stacklist = new StackAndQueue();
        stacklist.queue(56);
        stacklist.queue(30);
        stacklist.queue(70);

        stacklist.display();
        stacklist.peek();
    }

    public static void dequeueElement() {
        Operation.queueElement();
        Operation.pop();
    }

}