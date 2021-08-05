package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack { //the reason we created this class separately and not use the linkelist class for stack is because
                            //to restrict the number of methods for the class. If we used the linkedlist class directly,
                            //we would then be able to use other methods of linkedlist class like add, insert, etc which should
                            //not be there for stack implementation.

    //So we wrap the linkedlist in another class to not expose all the methods.

    private LinkedList<Employee> stack;  //this linkedlist is a doubly linked list. Note for stack doubly is not required
                                        //However, if memory isnt an issue than we can go ahead with this list.

    public LinkedStack(){
        this.stack = new LinkedList<>();
    }

    public void push(Employee employee){
        //The linked list class implements the deque interface was we can use the push method of that interface.
        stack.push(employee);
    }

    public Employee pop(){
        return stack.pop();
    }

    public Employee peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void printStack(){
        ListIterator<Employee> listIterator = stack.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}
