package com.cbfacademy.sort;

import java.util.Arrays;

public class QuickSort implements ArraySorter {

  public void sort(int[] arr, int startIndex, int endIndex) {
    // System.out.println(Arrays.toString(arr));
    // System.out.println(startIndex);
    // System.out.println(endIndex);
    // Ensure the position of the element is higher than the start element
    if (startIndex < endIndex) {
      // Partition the array around a pivot element and get its position
      int pivotIndex = partition(arr, startIndex, endIndex);
      
      // Recursively sort the partitions on either side of the pivot
      sort(arr, startIndex, pivotIndex - 1);
      sort(arr, pivotIndex + 1, endIndex);
    }
  }

  // We are given the input array, the position of the starting element and the position of the end element
  private int partition(int[] arr, int startIndex, int endIndex) {
    // Choose the rightmost element as the pivot
    int pivot = arr[endIndex];
    // Track the position of the element representing the boundary of the lower partition and initialise it to the position just before the starting element
    int boundaryIndex = startIndex - 1;

    // Iterate through every element in the array except the pivot
    for (int currentIndex = startIndex; currentIndex < endIndex; currentIndex++) {
      // If the current element is less than the pivot, then increment the boundary position and swap the element at the new boundary with the current element. This has the effect of pushing all lower values to the left of the array.
      if (arr[currentIndex] <= pivot) {
        // Increment the boundary of the lower partition
        boundaryIndex = boundaryIndex + 1;
        // Move the current element into the lower partition
        swap(arr, boundaryIndex, currentIndex);
      }
    }

    // Move the pivot between the lower and upper partitions
    swap(arr, boundaryIndex + 1, endIndex);

    // Return the position of the pivot
    return boundaryIndex + 1;
  }

  // We are given the input array, the position of the left-hand element and the position of the right-hand element
  private void swap(int[] arr, int leftIndex, int rightIndex) {
    // Store the value of the left-hand element
    int temp = arr[leftIndex];
    // Assign the value of the right-hand element to the left-hand element
    arr[leftIndex] = arr[rightIndex];
    // Assign the original value of the left-hand element to the right-hand element
    arr[rightIndex] = temp;
  }

}

//  GARY'S CODE

// package com.cbfacademy.sort;
// import java.util.ArrayList;
// //
// public class QuickSort implements ArraySorter{
//     // public static void main(String[] args){
//     //    // sort([1,4,6,9,2,5,6,8], 0, 7);
//     // }
//     public void sort(int[] arr, int startIndex, int endIndex)
//     {
//         if(startIndex < endIndex){
//            int pivotIndex = partition(arr, startIndex, endIndex);
//             sort(arr, startIndex, pivotIndex - 1);
//             sort(arr, pivotIndex + 1, endIndex);
//         }
//     }
//     // int arg[] = [2,5,8,1,3,7,9,10];
//                 //  0,1,2,3,4,5,6,7
//     public int partition(int[] arr, int startIndex, int endIndex){
//        int pivot = arr[endIndex];
//       int boundaryIndex = startIndex - 1;
//         for(int i = startIndex; i < endIndex; i++){
//             if (arr[i] <= pivot){
//                 boundaryIndex = boundaryIndex + 1;
//                 swap(arr, boundaryIndex, i);
//             }
//         }
//         swap(arr, boundaryIndex + 1, endIndex);
//         return boundaryIndex + 1;
//       // for currentIndex = startIndex to endIndex - 1
//     }
//     public void swap(int[] arr, int leftIndex, int rightIndex){
//        int temp = arr[leftIndex];
//         arr[leftIndex] = arr[rightIndex];
//         arr[rightIndex] = temp;
//     }
// }
