package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Employee james = new Employee("James","Bond",25);
        Employee bruce = new Employee("Bruce", "Wayne", 29);
        Employee clark = new Employee("Clark", "Kent",35);
        Employee john = new Employee("John", "Wick",36);
        Employee jason = new Employee("Jason", "Bourne",39);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(james);
        list.addFirst(bruce);
        list.addFirst(clark);
        list.addFirst(john);
        list.add(jason);    //.add adds the element at the end of the list. *Same as .addLast()*

        Iterator iterator = list.iterator();
        System.out.print("HEAD ->");
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print("<=>");
        }
        System.out.println("NULL");

        list.removeFirst();
        list.removeLast();
        iterator = list.iterator();
        System.out.print("HEAD ->");
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print("<=>");
        }
        System.out.println("NULL");
    }
}
