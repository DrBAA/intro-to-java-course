package com.cbfacademy.search;

public class BinarySearch implements Search {

    @Override
    public int search(int[] sortedArray, int target) {

        int low = 0;
        int high = sortedArray.length-1;
        int mid = (low+high)/2;
        
        if(target == sortedArray[mid]){
            return mid;
        }
        
        else if (target > sortedArray[mid]) {
            low = mid + 1;
        }
        
        else {
            high = mid - 1;
        }

        return target;
        
    };
}
