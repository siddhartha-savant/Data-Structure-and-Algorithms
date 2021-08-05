package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(recursiveLoop(3));
        System.out.println("\n"+ recursiveFunction(3));
    }

    public static int recursiveFunction(int num){
        //This is the breaking condition or the base case.
        if(num == 0){
            return 1;
        }

        //recursiveFunction calls are pushed to the call stack where recursiveFunction(3) is pushed 1st then
        //recursiveFunction(2), then recursiveFunction(1). So recursiveFunction(1) is popped off first when the breaking
        //condition is satisfied
        return num * recursiveFunction(num-1);
    }

    public static int recursiveLoop(int num){
        if(num == 0){
            return 1;
        }

        int factorial = 1;
        for(int i=1;i<=num;i++){
            factorial *= i;
        }
        return factorial;
    }
}
