package org.dsa.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        // Outer loop: Iterate through all elements in the array
        for (int i = 0; i < array.length; i++) {

            /* Initialize minIndex to store the index of the smallest element found */
            int minIndex = i;

            // Inner loop: Iterate through the remaining unsorted elements
            for (int j = i + 1; j < array.length; j++) {

                // Check if the current element is smaller than the element at minIndex
                if (array[j] < array[minIndex]) {

                    // Update minIndex with the index of the new smallest element found
                    minIndex = j;
                }
            }

            // Check if the smallest element found is not already in its correct position
            if (i != minIndex) {

                // Swap the smallest element found with the element at the current boundary

                // Store the element at the current boundary in a temporary variable
                int temp = array[i];

                // Move the smallest element found to its correct position in the sorted part
                array[i] = array[minIndex];

                // Move the element previously at the boundary to the position of the smallest element
                array[minIndex] = temp;
            }
        }
    }


    public static void main(String args[]){
        int arr[]={4,2,6,5,1,3};

        System.out.println(Arrays.toString(arr));//before sorting
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));//after sorting
    }
}
