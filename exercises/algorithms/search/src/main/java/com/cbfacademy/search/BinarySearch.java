package com.cbfacademy.search;

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
