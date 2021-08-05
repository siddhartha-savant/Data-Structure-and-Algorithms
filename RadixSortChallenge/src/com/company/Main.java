package com.company;

public class Main {

    public static void main(String[] args) {
        String[] str = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
        radixSort(str, 26, 5);

        for (String s : str){
            System.out.println(s);
        }

    }

    public static void radixSort(String[] str, int radix, int width){
        for(int i=width-1; i>=0; i--){
            sorting(str, radix, i);
        }
    }

    public static void sorting(String[] str, int radix, int width){

        int[] countingArray = new int[radix];
        int charToIntPosition;
        for(String value: str){
            charToIntPosition = getChar(value, width);
            charToIntPosition = charToIntPosition - 97;
            countingArray[charToIntPosition]++;
        }

        for(int i=1; i<countingArray.length; i++){
            countingArray[i] += countingArray[i-1];
        }

        String[] tempArray = new String[str.length];

        for(int j=str.length-1; j>=0; j--){
            tempArray[--countingArray[(getChar(str[j],width)-97)]] = str[j];
        }

        System.arraycopy(tempArray,0,str,0,str.length);
    }

    public static char getChar(String value, int width){
        return value.charAt(width);
    }

    //Another way we could have made a function which returns int and subtracted 'a' from it.
    // public static int getIndex(String value, int width){
    //        return value.charAt(width) - 'a';
    //    }
}
