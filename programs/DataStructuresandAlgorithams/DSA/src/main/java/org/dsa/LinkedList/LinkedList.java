package org.dsa.LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList() {
        // Node newNode=new Node();
        head = null;
        tail = null;
        length = 0;
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void getHead() {
        if (head == null) {
            System.out.println("head is null");

        } else {
            System.out.println("head value is " + head.getValue());
            System.out.println("head = " + head);
        }
    }

    public void getTail() {
        if (tail == null) {
            System.out.println("Tail is null");
        } else {
            System.out.println("Tail Value is " + tail.getValue());
            System.out.println("Tail = " + tail);
        }
    }

    public void getLength() {
        if (length != 0) {
            System.out.println("length is " + length);
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }


    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);//setting the current tails next as current/new node
            tail = newNode;//setting the tail reference to new node
        }
        length++;//increasing the length of list after appending the existing list.

    }

    public Node removeLast() {
        if (length == 0) {
            System.out.println("there are no elements in the list");
            return null;
        } else {

            Node temp = head, pre = head;
            while (temp.getNext() != null) {

                pre = temp;
                temp = temp.getNext();
            }
            ;
            tail = pre;
            tail.setNext(null);
            length--;
            if (length == 0) {

                head = null;
                tail = null;

            }

            return temp;
        }
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        } else {
            Node temp = head;
            head = head.getNext();
            temp.setNext(null);
            length--;
            if (length == 0) {
                tail = null;
            }
            return temp;
        }
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        } else {
            Node temp = head;
            for (int i = 1; i <= index; i++) {
                temp = temp.getNext();
            }

            return temp;
        }
    }

    public boolean set(int index, int value) {


        Node temp = get(index);
        if (temp != null) {
            temp.setValue(value);

            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;
        else if (length == 0) {
            prepend(value);
            return true;
        } else if (length == length) {
            append(value);
            return true;
        } else {

            return true;
        }
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == (length - 1)) {
            return removeLast();
        } else {
            Node pre = get(index - 1);
            Node temp = pre.getNext();
            pre.setNext(temp.getNext());
            temp.setNext(null);
            length--;
            return temp;
        }
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.getNext();
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.getNext();
            temp.setNext(before);
            before = temp;
            temp = after;
        }

    }
    public void bubbleSort(){
        if(length>2){

            Node sortedUntil=null;
            while(sortedUntil!= this.head.getNext()){
                Node current=this.head;
                while(current.getNext() !=sortedUntil){
                    Node nextNode= current.getNext();
                    if(current.getValue() > nextNode.getValue()){
                        int temp= current.getValue();
                        current.setValue(nextNode.getValue());
                        nextNode.setValue(temp);
                    }
                    current= current.getNext();
                }
                sortedUntil=current;
            }
        }
    }


}