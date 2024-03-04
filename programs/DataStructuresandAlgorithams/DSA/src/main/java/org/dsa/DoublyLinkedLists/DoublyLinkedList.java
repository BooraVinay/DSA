package org.dsa.DoublyLinkedLists;

import org.dsa.LinkedList.Node;

public class DoublyLinkedList {
    public class Node {
        public int value;
        public Node next;
        public Node prev;

        public Node() {
        }

        public Node(int value) {
            this.value = value;
        }
        @Override
        public String toString() {
            return "Node{value =" + value +
                    ", next =" + (next == null ? null : next.value) +
                    ", prev =" + (prev == null ? null : prev.value) +
                    '}';
        }

    }

    Node head, tail;
    int length;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void getHead() {
        if (head == null) {
            System.out.println("head is null");

        } else {
            System.out.println("head value is " + head.value);
            System.out.println("head = " + head);
        }
    }

    public void getTail() {
        if (tail == null) {
            System.out.println("Tail is null");
        } else {
            System.out.println("Tail Value is " + tail.value);
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
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public void append(int value){
        Node newNode=new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }
        else{
           tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;

        }
        length++;
    }
    public Node removeLast(){
        if(length==0){
            return null;
        }
        else{
            Node temp=tail;
            tail=tail.prev;
            tail.next=null;
            temp.prev=null;
            length--;
            if(length==0){
                head=null;
                tail=null;
            }
            return temp;
        }
    }
    public void prepend(int value){
        Node newNode=new Node(value);

        if(length==0){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        length++;
    }
    public Node removeFirst(){
        if(length==0){
            return null;
        }
        else{
            Node temp=head;
            head=head.next;
            head.prev=null;
            temp.next=null;
            length--;
            if(length==0){
                head=null;
         tail=null;
            }
            return temp;
        }
    }
public Node get(int index){
        if(index<0 || index>=length){
            return null;
        }
        else {
            Node temp = head;
            if (index < (length / 2)) {

                for(int i=1;i<=index;i++)
               temp=temp.next;
            }
            else{
                temp=tail;
                for(int i=length-1;i>index;i--){
                    temp=temp.prev;
                }
            }
            return temp;
        }
}
   public boolean set(int index,int value){

            Node temp=get(index);
            if(temp!=null) {
                temp.value = value;
                return true;
            }
            return false;
   }
   public boolean insert(int index,int value){
       Node newNode=new Node(value);
        if(index<0 || index>length){
            return false;
        }
      else if(index==0){
           prepend(value);
           return true;
       }
       else if(length==index){
           append(value);
           return true;
       }
       else{
          Node temp=get(index);
          if(temp!=null) {
            Node prev=temp.prev;
            prev.next=newNode;
            newNode.prev=prev;
            newNode.next=temp;
            temp.prev=newNode;
           length++;
              return true;
          }
          return false;
       }

   }
   public Node remove(int index){

        if(index<0||index>=length){
            return null;
        }
        else if(index==0){
            return removeFirst();
        }
        else if(index==(length-1)){
            return removeLast();
        }
        else{
            Node temp=get(index);

            if(temp!=null){
                Node after=temp.next;
                Node before=temp.prev;
                temp.next=null;
                temp.prev=null;
                before.next=after;
                after.prev=before;
                length--;
                /* we can also implement it like this
                temp.next.prev=temp.prev;
                temp.prev.next=temp.next;
                temp.next=null;
                temp.prev=null;
                 */
                return temp;

            }
            return null;
        }
   }
}

