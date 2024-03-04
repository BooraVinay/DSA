package org.dsa.LinkedList.LeetCodeInterviewQuestions;

/**
 * Problem Statement:
 * Implement a method called findMiddleNode that returns the middle node of the linked list.
 * If the list has an even number of nodes, the method should return the second middle node.
 * <p>
 * Method signature:
 * public Node findMiddleNode()
 * <p>
 * Example:
 * FindMiddleNode myList = new FindMiddleNode(1);
 * myList.append(2);
 * myList.append(3);
 * myList.append(4);
 * myList.append(5);
 * FindMiddleNode.Node middleNode = myList.findMiddleNode();
 * System.out.println(middleNode.value); // Output: 3
 * myList.append(6);
 * middleNode = myList.findMiddleNode();
 * System.out.println(middleNode.value); // Output: 4
 * <p>
 * When the linked list has an odd number of nodes, like 1 -> 2 -> 3 -> 4 -> 5,
 * the function will find the exact middle node. In this case, it will return the node containing the value 3.
 * <p>
 * When the linked list has an even number of nodes, there will be two middle nodes.
 * The findMiddleNode function will return the second of these two middle nodes.
 * For example, if the linked list is 1 -> 2 -> 3 -> 4 -> 5 -> 6, the two middle nodes are 3 and 4.
 * The function will return the node containing the value 4.
 */
public class FindMiddleNode {

    /**
     * Implementation of a singly linked list.
     */
    public class Node {
        public int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head;  // Head pointer of the linked list
    private Node tail;  // Tail pointer of the linked list

    /**
     * Constructs a linked list with a single node.
     *
     * @param value The value for the initial node.
     */
    public FindMiddleNode(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    /**
     * Gets the head of the linked list.
     *
     * @return The head node.
     */
    public Node getHead() {
        return head;
    }

    /**
     * Gets the tail of the linked list.
     *
     * @return The tail node.
     */
    public Node getTail() {
        return tail;
    }

    /**
     * Prints all elements of the linked list.
     */
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    /**
     * Prints information about the linked list including head, tail, and elements.
     */
    public void printAll() {
        System.out.println("-------------------------");
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    /**
     * Makes the linked list empty.
     */
    public void makeEmpty() {
        head = null;
        tail = null;
    }

    /**
     * Appends a new node with a given value to the linked list.
     *
     * @param value The value to append.
     */
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    /**
     * Finds the middle node of the linked list.
     * This algorithm uses the slow and fast pointer technique,
     * also known as Floyd's Tortoise and Hare algorithm,
     * to find the middle element of the linked list.
     *
     * @return The middle node.
     */
    public Node findMiddleNode() {
        Node fast = head, slow = head;

        // Traverse the linked list with two pointers: slow and fast
        // slow moves one node at a time, while fast moves two nodes at a time
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Return the middle node of the linked list
        return slow;
    }


    /**
     * Finds the middle node of the linked list using node counting.
     *
     * @return The middle node.
     */
    public Node findMiddleNodeCounting() {
        Node temp = head;
        int count = 0;

        // Count the total number of nodes in the linked list
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        int index = count / 2;

        // Return the node at the middle index
        return get(index);
    }

    public Node get(int index) {


        Node temp = head;
        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }
        return temp;

    }

    public static void main(String args[]) {

        FindMiddleNode myList = new FindMiddleNode(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);

        Node middleNode = myList.findMiddleNode();
        myList.printAll();
        System.out.println("Middle Node: " + middleNode.value); // Output: 3

        myList.append(6);
        middleNode = myList.findMiddleNode();
        myList.printAll();
        System.out.println("Middle Node: " + middleNode.value); // Output: 4
    }
}
