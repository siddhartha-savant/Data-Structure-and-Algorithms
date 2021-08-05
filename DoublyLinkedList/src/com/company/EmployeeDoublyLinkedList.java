package com.company;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);

        if(head == null){
            tail = node;
        }
        else{
            head.setPrevious(node);
            node.setNext(head);
        }
        head = node;
        size++;
    }

    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);

        if(tail == null){
            head = node;
        }
        else{
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public int getSize(){
        return this.size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public EmployeeNode removeFrontNode(){
        if (isEmpty()){
            return null;
        }
        EmployeeNode removedNode = head;

        if(head.getNext() == null){ //This is to check whether there is only one element in the list
            tail = null;
        }else{
            head.getNext().setPrevious(null);  //We could use head.getPrevious instead of null which will be the same
        }
        head = head.getNext();
        size--;
        removedNode.setNext(null);  //This is to completely remove the node. We are just cleaning up the reference
        return removedNode;
    }

    public EmployeeNode removeEndNode(){
        if (isEmpty()){
            return null;
        }
        EmployeeNode removedNode = tail;

        if(tail.getPrevious() == null){ //This is to check whether there is only one element in the list
            head = null;
        }else{
            tail.getPrevious().setNext(null);  //We could use tail.getNext instead of null which will be the same
        }
        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);  //This is to completely remove the node. We are just cleaning up the reference
        return removedNode;
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

