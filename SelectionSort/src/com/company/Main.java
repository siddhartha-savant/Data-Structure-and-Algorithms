package com.company;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};


        for (int i=0; i< intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // Here in the 2nd for loop we have included <= and not just < (which was there in bubble sort). The reason for
        // which it was not there in bubble sort was because we were comparing index and index+1 values. If we had
        // included the lastIndex there as well (i.e. <= lastIndex), then we would have gotten out of bounds error due
        // to index + 1. Here the comparison is not between index or index + 1, therefore we need to add it.
        for(int lastIndex = intArray.length-1; lastIndex>0; lastIndex--){
            int highestNumber = 0;
            for(int index = 1; index <= lastIndex; index++) {
                if (intArray[highestNumber] < intArray[index]) {
                    highestNumber = index;
                }
            }
            swap(intArray, highestNumber, lastIndex);

        }

        System.out.println("\nInsertion sort:");
        for (int j : intArray) {
            System.out.println(j);
        }

    }

    public static void swap(int[] intArray, int i, int j) {
        int temp = intArray[j];
        intArray[j] = intArray[i];
        intArray[i] = temp;
    }
}
