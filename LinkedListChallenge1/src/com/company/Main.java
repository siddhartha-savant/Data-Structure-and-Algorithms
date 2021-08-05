package com.company;

public class Main {

    public static void main(String[] args) {
        Employee james = new Employee("James","Bond",25);
        Employee bruce = new Employee("Bruce", "Wayne", 29);
        Employee clark = new Employee("Clark", "Kent",35);
        Employee john = new Employee("John", "Wick",35);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addBefore(james);
        list.addBefore(bruce);
        list.addBefore(clark);
        list.addBefore(john);

        list.printList();
    }
}
