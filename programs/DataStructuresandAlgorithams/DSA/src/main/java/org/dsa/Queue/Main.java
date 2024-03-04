package org.dsa.Queue;

import org.dsa.Stack.Stack;

import java.util.Arrays;


public class Main {
    public static void main(String args[]) {
        Queue queue = new Queue(1);
        getPrintQueue(queue);
        queue.enqueue(2);
        getPrintQueue(queue);
        queue.dequeue();
        getPrintQueue(queue);
        queue.dequeue();
        getPrintQueue(queue);
    }

    public static void getPrintQueue(Queue queue){
        queue.printQueue();
try {



    queue.getFirst();

    queue.getLast();
    queue.getLength();
}
catch(Exception e){

    }

    }
}
