package com.company;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1 -22};

        quickSort(intArray, 0, intArray.length);
        for(int i: intArray){
            System.out.println(i);
        }
    }

    public static void quickSort(int[] input, int start, int end){

        if(end - start < 2){
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex+1, end);
    }

    public static int partition(int[] input, int start, int end){
        // In this implementation we are using the first element as the pivot.
        int pivot = input[start];
        int i = start;
        int j = end;

        while(i<j){

            //This is an empty loop body just to keep a track of j
            while(i<j && input[--j] >= pivot);
            if(i<j){
                input[i] = input[j];
            }

            while(i<j && input[++i] <= pivot);
            if(i<j){
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }
}
