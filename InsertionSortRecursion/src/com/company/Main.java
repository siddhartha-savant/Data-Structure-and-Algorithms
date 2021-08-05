package com.company;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {22, -31, 10, 0, 50, 10, -22};

        insertionSortRecursion(intArray,7);
        for (int i : intArray) {
            System.out.println(i);
        }
    }

    // As per the iterative solution for insertion sort, we know the 1st for loop iteration starts with 1 then 2,3..length.intArray
    // We need to create a similar loop through recursion. As per our insertion sort solution, we consider 0th element as sorted
    // and compare that with the 1st unsorted element present in the 1st position. We then compare that value with the sorted element.
    // Thus we will define the base class for the 1st unsorted element and then continue with the comparison.
    // insertionSortRecursive(arr, n) in our case n=7. We then call the function insertionSortRecursive(arr, n-1).
    // We cannot write for n=1 ie insertionSortRecursive(arr, n) for n=1 and then call function insertionSortRecursive(arr, n+1)
    // Because when we try to return for the base case the value  for n will be 7, we want it to be 1.

    // In short if we want to create a loop from recursion that is initialized from 0 or 1 and is incremented for every iteration,
    // use this

    // Higher values to lower values if operation to be done is on lower values 1st. Therefore n = 6 and not 1
    // Lower to higher values if operation to be done is on higher values 1st.


    public static void insertionSortRecursion(int[] arr, int n){

        if(n<=1){
            return;
        }

        insertionSortRecursion(arr, n-1);

        int newElement = arr[n-1];
        int i;
        for(i = n-1; i>0 && arr[i-1] > newElement; i--){
            arr[i] = arr[i-1];
        }
        arr[i] = newElement;
    }
}
