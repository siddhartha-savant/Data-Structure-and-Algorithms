package com.company;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {2, 4, 5, 6, 10, 9, 8, 4, 2, 1, 0, 7};

        countingSort(intArray,0,10);
        for(int i : intArray){
            System.out.println(i);
        }
    }

    public static void countingSort(int[] input, int min, int max){
        int[] countArray = new int[(max - min + 1)];

        for(int i=0; i < input.length; i++){
            countArray[input[i] - min]++;
        }

        //j is the index we are using to write to the input array. i is the index we are using to traverse the count array
        // count[i-min] will have the value for the times the value is appearing. In the end we will decrement the value
        //after assigning it to input[j++]
        int j =0;
        for(int i=min; i<=max; i++){
            while(countArray[i-min]>0){
                input[j++] = i;
                countArray[i-min]--;
            }
        }
    }
}
