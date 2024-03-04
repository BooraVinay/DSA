package org.dsa.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        // Outer loop: Starts at the end of the array and moves towards the beginning
        for (int i = array.length - 1; i > 0; i--) {

            // Inner loop: Starts at the beginning of the array and moves towards index i
            for (int j = 0; j < i; j++) {

                // Check if the current element is greater than the adjacent element
                if (array[j] > array[j+1]) {

                    // If the elements are in the wrong order, swap them

                    // Store the current element in a temporary variable
                    int temp = array[j];

                    // Move the smaller element (adjacent element) to the current position
                    array[j] = array[j+1];

                    // Move the larger element (stored in temp) to the adjacent position
                    array[j+1] = temp;
                }
            }
        }
    }


    public static void printList(int arr[]){

       for(int a:arr){
           System.out.println(a);
       }
        System.out.println("----------------");
    }
    public static void main(String args[]){
        int arr[]={5,3,9,1,76,78,89,0,43};
        printList(arr);//before sorting
        bubbleSort(arr);
        printList(arr);//after sorting
    }
}
