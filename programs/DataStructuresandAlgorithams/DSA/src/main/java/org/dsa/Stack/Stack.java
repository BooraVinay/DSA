package org.dsa.Stack;

public class Stack {

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    Node top;
    int height;
    public Stack(int value){
        Node newNode=new Node(value);
        top=newNode;
        height=1;
    }

    public void printStack(){
  Node temp=top;
        System.out.println("Stack :");
  while(temp!=null){
      System.out.println(temp.value);
      temp=temp.next;
  }
    }
    public void getTop(){
      System.out.println("Top "+top.value);
    }
    public void getHeight(){
        System.out.println("Height "+height);
    }
    public void push(int value){
        Node newNode=new Node(value);
        if(height==0){
            top=newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }
        height++;
    }
    public Node pop(){
        if(height==0) {
            return null;
        }
        else{
          Node temp=top;
          top=top.next;
          temp.next=null;
          height--;
            return temp;
        }
    }


}
