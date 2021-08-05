package com.company;

public class Main {

    public static void main(String[] args) {
	 int[] intArray = {20, 35, -15, 7, 55, 1, -22};
	 int start = 0;
	 int end = intArray.length;

	 mergeSort(intArray,start,end);

	 for(int i: intArray){
         System.out.println(i);
     }
    }

    public static void mergeSort(int[] input, int start, int end){

        // This is when only 1 element is present for sorting
        if(end - start < 2){
            return;
        }

        int mid = (start + end)/2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end){

        if(input[mid -1] < input[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];

        while(i<mid && j<end){

           temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];

        }
        // This provision is for the remaining unsorted element from the above logic. We are just copying that particular
        // element (when the element is in left unsorted) at the very end of this particular array. We will then
        // copy the temp array in the input array. The position is going to be i as it is where the unsorted position of
        // the element will be when the while loop of line 41 is unsatisfied. We won't be taking any j values, because
        // even if the array is unsorted, it will still be present at the end of the original array. So we will just
        // copy it directly. Also the below line won't do anything if there are no leftover elements in the left array
        // as mid-i = 0
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
