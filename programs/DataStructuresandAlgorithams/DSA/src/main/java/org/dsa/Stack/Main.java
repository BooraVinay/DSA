package org.dsa.Stack;

public class Main {
    public static void main(String args[]){
        Stack stack=new Stack(2);
        stack.push(4);

        getPrintStack(stack);
        stack.pop();

        getPrintStack(stack);
    }

    public static void getPrintStack(Stack stack){

        stack.printStack();
        stack.getTop();
        stack.getHeight();
    }
}
