package org.dsa.DoublyLinkedLists;

import org.dsa.LinkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
  DoublyLinkedList list=new DoublyLinkedList(6);
  list.append(8);
  list.append(9);
  list.prepend(10);
        list.insert(2,3);
        printListState("Printing... ",list);
        list.remove(4);
        printListState("Printing... ",list);
        list.remove(1);
        printListState("Printing... ",list);
    }

    private static void printListState(String message, DoublyLinkedList list) {
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
