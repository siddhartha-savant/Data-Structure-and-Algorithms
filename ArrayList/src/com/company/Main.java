package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList =  new ArrayList<>();
        employeeList.add(new Employee("Steve","Bruce",88));
        employeeList.add(new Employee("Steve","Ballmer",112));
        employeeList.add(new Employee("Rich","Jones",3232));
        employeeList.add(new Employee("Nathan","Horitz",118));
        employeeList.add(new Employee("Mark","Rober",8444));
        employeeList.add(new Employee("Dane","Dickerson",1138));

        //employeeList.forEach(a -> System.out.println(a));

        System.out.println(employeeList.get(2));

        employeeList.set(2, new Employee("James","Harden",123));
        //employeeList.forEach(System.out::println);

        employeeList.add(2,new Employee("Lebron","James",1));
        //employeeList.forEach(a -> System.out.println(a));

        Employee[] newEmployeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee : newEmployeeArray){
            System.out.println(employee);
        }

        //We will get false for this. Reason being even though the structure is same, these are two different instances
        //different objects all together. To compare them according their fields only, we need to override the equals()
        //in the Employee class. After overriding the value returned will be true.
        System.out.println(employeeList.contains(new Employee("James","Harden",123)));

        System.out.println(employeeList.indexOf(new Employee("James","Harden",123)));

        employeeList.remove(3);
        System.out.println("--------------");
        employeeList.forEach(a-> System.out.println(a));

    }
}
