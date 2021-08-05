package com.company;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack;
    private int top;  //top would always be the index where we would push the next element. It will always point to the
                      //next available position

    public ArrayStack(int capacity){
        this.stack = new Employee[capacity];
    }

    public void push(Employee employee){
        if(top == stack.length){
            //we need to resize the array. For this we will copy all the elements in the new array
            Employee[] newArray = new Employee[2*stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack = newArray;
        }

        stack[top++] = employee;
    }

    public Employee pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        Employee employee = stack[--top];  //There is nothing stored at top, Its stored at top-1, thus pre decrement
        stack[top] = null;                 // Note that the push is post incremented
        return employee;
    }

    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public boolean isEmpty(){
        return top==0;
    }

    public void printStack(){
        for(int i=top-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }


}
