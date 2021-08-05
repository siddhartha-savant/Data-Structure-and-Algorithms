package com.company;

public class Main {

    public static void main(String[] args) {

        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(radixArray, 10, 4);

        for(int i = 0;i< radixArray.length;i++){
            System.out.println(radixArray[i]);
        }
    }

    public static void radixSort(int[] input, int radix, int width){
        for(int i = 0; i<width; i++){
            sortPosition(input, i, radix);
        }
    }

    public static void sortPosition(int[] input, int position, int radix){
        int inputLength = input.length;
        int[] countingArray = new int[radix];

        //Raw counting array where each location will have just the actual number of occurrence of that number
        for (int value : input) {
            countingArray[getDigit(value, position, radix)]++;
        }

        //countingArray must contain at each position, values available till that position for it to be stable algo.
        //We will start with 1, as for 0 value, it won't contain values at previous positions besides the values at 0.
        for(int j = 1; j< countingArray.length; j++){
            countingArray[j] += countingArray[j-1];
        }

        int[] tempArray = new int[inputLength];
        for(int tempIndex = inputLength-1; tempIndex >= 0; tempIndex--){
            tempArray[--countingArray[getDigit(input[tempIndex], position, radix)]] = input[tempIndex];
        }

        for(int i=0;i< tempArray.length;i++){
            input[i] = tempArray[i];
        }
    }

    // Very imp function which returns every digit of a number.
    public static int getDigit(int value, int position, int radix){
        return value / (int) Math.pow(radix,position) % radix;
    }
}
