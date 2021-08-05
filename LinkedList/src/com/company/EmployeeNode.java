package com.company;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;

    // The constructor only takes in the employee because when we construct an instance we don't know yet what the next node
    // will be. We will add that later.
    public EmployeeNode(Employee employee){
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public String toString(){
        return employee.toString();
    }
}
