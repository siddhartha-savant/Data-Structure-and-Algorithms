package com.company;

public class Main {

    public static void main(String[] args) {
        Employee james = new Employee("James","Bond",25);
        Employee bruce = new Employee("Bruce", "Wayne", 29);
        Employee clark = new Employee("Clark", "Kent",35);
        Employee john = new Employee("John", "Wick",35);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        System.out.println(list.isEmpty());
        list.addToFront(james);
        list.addToFront(bruce);
        list.addToFront(clark);
        list.addToFront(john);

        System.out.println(list.getSize());
        list.printList();

        Employee jason = new Employee("Jason", "Bourne",39);
        list.addToEnd(jason);

        list.removeFrontNode();
        System.out.println(list.getSize());
        list.printList();

        list.removeEndNode();
        System.out.println(list.getSize());
        list.printList();

    }
}
