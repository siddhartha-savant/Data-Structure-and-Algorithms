package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] intArray = new int[7];
	    intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        for(int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // This bubble sort is somewhat optimised. Here we are creating sorted and unsorted partitions. The unsorted
        // partition initially is the index of the last element. As the loop iterates, the sorted partition goes on
        // increasing reducing the number of elements to be swapped. However, in reality, for bubble sort we wouldn't
        // use such optimization and the time complexity therefore will be quadratic. Remember if you have 1 loop the
        // time complexity is O(n), therefore for bubble sort it will be O(n2)

        for(int unsortedIndex = intArray.length-1; unsortedIndex>0; unsortedIndex--){
            for(int index=0; index<unsortedIndex; index++){
                if(intArray[index]>intArray[index+1]){
                    swap(intArray, index,index+1);
                }
            }
        }

        System.out.println("The array after bubble sort:");
        for (int j : intArray) {
            System.out.println(j);
        }

    }

    public static void swap(int[] intArray, int i, int j){
        int temp;
        if(i == j){
            return;
        }
        temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}
