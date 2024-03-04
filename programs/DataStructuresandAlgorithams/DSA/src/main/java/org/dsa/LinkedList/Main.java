package org.dsa.LinkedList;

import org.dsa.LinkedList.LinkedList;

public class Main {

    public static void main(String args[]) {
        // Create a new LinkedList
        LinkedList list = new LinkedList();

        // Initial state of the list
        printListState("Initial state of the list", list);

        // Append 5 to the list
        list.append(5);
        printListState("After appending 5", list);

        // Prepend 9 to the list
        list.prepend(9);
        printListState("After prepending 9", list);

        // Get and set value at index 0
        System.out.println("Value at index 0: " + list.get(0).getValue());
        list.set(0, 3);
        printListState("After setting value at index 0 to 3", list);

        // Append 6 to the list
        list.append(6);
        printListState("After appending 6", list);

        // Remove the first element
        //list.removeFirst();
       // printListState("After removing the first element", list);

        // Remove the last element
        //list.removeLast();
        //printListState("After removing the last element", list);

        // Remove element at index 1
        //list.remove(1);
        //printListState("After removing element at index 1", list);

        // Reverse the list
       // list.reverse();
       // printListState("After reversing the list", list);
       list.bubbleSort();
        printListState("sorted list", list);
    }

    // Helper method to print head, tail, length, and the current state of the list
    private static void printListState(String message, LinkedList list) {
        System.out.println(message);
        System.out.println("Head: ");
        list.getHead();
        System.out.println("Tail: ");
        list.getTail();
        System.out.println("Length: ");
        list.getLength();
        System.out.println("Linked List:");
        list.printList();
        System.out.println("--------------");
    }
}
