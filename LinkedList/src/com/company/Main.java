package com.company;


public class Main {

    public static void main(String[] args) {

        Employee james = new Employee("James","Bond",25);
        Employee bruce = new Employee("Bruce", "Wayne", 29);
        Employee clark = new Employee("Clark", "Kent",35);
        Employee john = new Employee("John", "Wick",35);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());
        list.addToFront(james);
        list.addToFront(bruce);
        list.addToFront(clark);
        list.addToFront(john);

        System.out.println(list.getSize());
        list.printList();

        list.removeFrontNode();
        System.out.println(list.getSize());
        list.printList();

    }
}
