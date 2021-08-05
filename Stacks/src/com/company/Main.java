package com.company;

public class Main {

    public static void main(String[] args) {
	    ArrayStack arrayStack = new ArrayStack(10);

	    arrayStack.push(new Employee("Josephine","Jackson",1));
        arrayStack.push(new Employee("Jesse","Jane",2));
        arrayStack.push(new Employee("Nikki","Benz",3));
        arrayStack.push(new Employee("Ava","Addams",4));
        arrayStack.push(new Employee("Skylar","Vox",5));

        //arrayStack.printStack();

        //System.out.println(arrayStack.peek());

        arrayStack.pop();
        arrayStack.printStack();

    }
}
