package com.company;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int i : intArray){
            System.out.println(i);
        }

        // This implementation of insertion sort doesn't need swap. We are not swapping, we are shifting elements.
        // The value of firstUnsortedIndex is also from 1 because the element position 0 is in the sorted position.
        // newElement is the value that will be needed when we shift the value to the sorted array. (As the value is
        // overwritten).
        // i > 0 is used to continue to loop as long as we have not hit the front of the array.
        // intArray[i-1] > newElement means we want to keep looking as long as the value present in the sorted partition
        // is greater than the one we are trying to insert, because if the element intArray[i-1] is greater than the
        // element we are trying to insert, then we still haven't found the correct insertion position.
        // intArray[i] = intArray[i-1] means we are basically shifting (copying) the element to the right as the conditions
        // were satisfied.

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++ ){
            int newElement = intArray[firstUnsortedIndex];
            int i;

            for(i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--){
                intArray[i] = intArray[i-1];

            }
            intArray[i] = newElement;
        }

        System.out.println("\nInsertion Sort:");
        for(int j : intArray){
            System.out.println(j);
        }
    }
}
