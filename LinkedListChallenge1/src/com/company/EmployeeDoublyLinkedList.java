package com.company;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addBefore(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        if(head == null) {
            head = node;
            tail = node;
        }else if(size == 1) {
            head.setPrevious(node);
            node.setNext(head);
            head = node;
        }else{
            tail.getPrevious().setNext(node);
            tail.setPrevious(node);
            node.setPrevious(tail.getPrevious());
            node.setNext(tail);
        }
        size++;
    }


    public void printList(){
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current!=null){
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("Null");
    }
}

