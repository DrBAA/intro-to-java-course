package com.cbfacademy.search;


public class BinarySearch implements Search{


    @Override
    public int search(int[] sortedArray, int target) {

        // Initialize the starting search point (lowest index) to 0
        int low = 0;
        // Initialize the maximum index (highest index) to the last element’s index in the array
        int high = sortedArray.length - 1; 

        // Enter a loop while the search range is valid (low index is less than or equal to high index)
        while (low <= high) {
            // Calculate the middle index (mid) using integer division.
            int arrayMidPoint = low + (high - low)/2;
            int midValue = sortedArray[arrayMidPoint];
           //  System.out.println("mid is: " + value);
            // compare the middle element with the target. If the middle element equals the target, return the mid index 
            if (midValue == target) return arrayMidPoint;
            // If the middle element is less than the target, move the midpoint and adjust the search range to the right half.
            else if (midValue < target) low = arrayMidPoint + 1; 
            // Otherwise (middle element is greater than the target), move the midpoint and adjust the search range to the left half.
            else high = arrayMidPoint - 1; 
        }
        // If the loop completes without finding the target, return -1 (element not found)
        return -1; // target not found
    }  

} 


/* FROM CBF
public class BinarySearch implements Search {

    @Override
    public int search(int[] sortedArray, int target) {

        int low = 0;
        int high = sortedArray.length-1;

        // iterate until l <= r
        while (low <= high) {
            int mid = (low+high)/2;

        // check if target is at mid

        
        if(target == sortedArray[mid]){
            return mid;
        }
        
        // if target greater than mid then ignore left half
        else if (target > sortedArray[mid]) {
            low = mid + 1;
        }
        
        else {
            high = mid - 1;
        }

        // if element not present

        return -1;
        
        }
        return high;

        // return binarySearch.search(sortedArray, target);

    }

}

*/
