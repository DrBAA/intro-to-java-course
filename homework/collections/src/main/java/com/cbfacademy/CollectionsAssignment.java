package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.*;//stream.Collectors;



public class CollectionsAssignment {

//    ./mvnw clean test 

    /**
     * This method removes all values from the provided list that are smaller
     * than the indicated integer. The remaining elements retain their original
     * ordering.
     *
     * @param list   - the list of integers
     * @param minValue the minimum value to retain
     */
    public static void removeSmallInts(List<Integer> list, int minValue) {        
              
        
        // Your solution must traverse the list from last to first element
        // removing any values less than minValue.
            // for (int i = list.size()-1; i>=0; i--){
            //     if (list.get(i) < minValue){
            //         list.remove(i);
            //     }

            // }
            ListIterator<Integer> listIter = list.listIterator(list.size());
            while (listIter.hasPrevious()) {
                int currentValue = listIter.previous();
                if (currentValue < minValue) {
                    listIter.remove();
                }
            }

    }

    /**
     * This method returns true if the provided collection contains any duplicate elements.
     * @param integers - a collection of integers
     * @return true if integers contains duplicates, false otherwise
     */
    public static boolean containsDuplicates(Collection<Integer> integers) {
        // Your solution must not use any loops.
        Set <Integer> uniqueElements = new HashSet<>();
        for (Integer element : integers) {
            if (!uniqueElements.add(element)){
                return true;  // duplicate found              
            }
        }

        return false; // No duplicates found

    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * either of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order.
     * <p>
     * For example, if the two arguments contain {2, 1, 2, 3} and {3, 4, 4, 5},
     * the returned ArrayList will contain {1, 2, 3, 4, 5}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return A sorted ArrayList containing the integers that appear in either
     * collection.
     */
    public static ArrayList<Integer> inEither(Collection<Integer> ints1, Collection<Integer> ints2) {
//        This must be done with no loops.
        Set<Integer> combinedSet = new HashSet<>(ints1);
        combinedSet.addAll(ints2);

        ArrayList<Integer> sortedList = new ArrayList<>(combinedSet);
        Collections.sort(sortedList);
        return sortedList;
    }
    

    /**
     * This method returns an ArrayList containing all elements that appear in
     * both of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order. For example, if the two arguments contain {2, 1, 2, 3} and
     * {3, 4, 4, 5}, the returned ArrayList will contain {3}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return An ArrayList containing the integers that appear in both
     * collections.
     */
    public static ArrayList<Integer> inBoth(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.

       /* To solve this problem without using loops,
        We create two HashSet objects (set1 and set2), based on the contents of the ints1 and ints2 lists, to store unique elements from ints1 and ints2.
        set1 is initialized with the elements from ints1.
        set2 is initialized with the elements from ints2.
        During initialization, the HashSet constructor automatically ensures uniqueness by discarding duplicate values.
        The hash table (internal data structure) of each HashSet stores only distinct elements.
        Any duplicate values in the original lists are effectively removed.
        For example if we have the following lists
        List<Integer> ints1 = List.of(2, 1, 2, 3);
        List<Integer> ints2 = List.of(3, 4, 4, 5);
        After creating the HashSet objects:
        set1 contains {1, 2, 3} (no duplicates).
        set2 contains {3, 4, 5} (no duplicates).
        */

        Set<Integer> set1 = new HashSet<>(ints1); // 1, 2, 3
        Set<Integer> set2 = new HashSet<>(ints2); // 3, 4, 5

        // We use retainAll to find the intersection of the two sets (i.e., common elements).
        // The retainAll() method is used to retain only the elements that are common between two sets (or collections). 
        set1.retainAll(set2); // intersection of sets

        // we convert the result back to an ArrayList 
        // List<Integer> result = new ArrayList<>(set1); // will need typecasting when returning the results
        ArrayList<Integer> result = new ArrayList<>(set1);
        
        // we sort the ArrayList
//        result.sort(null); // sort the result 
        Collections.sort(result); 
        
        // we print the sorted ArrayList
//        return (ArrayList<Integer>) result; // type casting if using List interface to create the ArrayList as in line 128 above
        return result; // When you use return result;, the compiler checks if the return type matches the declared return type  on the method (ArrayList<Integer>). if it doesnt match, typecasting will be needed.

    }

    /**
     * This method returns the String that appears most frequently in the
     * provided list. For example, if the input list contains the elements
     * {"Bob", "Alice", "Bob"}, this method will return "Bob". If there are
     * ties, any of the most frequently occurring elements may be returned.
     * If the list is empty, return the empty string "".
     *
     * @param list - a list of Strings
     * @return the most frequently occurring String
     */
    public static String mostFrequent(List<String> list) {
        // You should solve this problem in two stages: First iterate through
        // the list to count occurrences of each String. Then iterate through
        // your counts to find the largest. You'll need a collection that allows
        // you to store a mapping from Strings to counts.
        // No nested loops or non-enhanced for-loops are allowed.
        
        if(list.isEmpty()){
            return ""; 
        }

        Map<String, Integer> frequencyMap = new HashMap<>();

        // iterate through the list to count occurrences of each String.
        for (String str : list) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }

        // iterate through the counts to find the maximum frequency

        int maxFrequency = 0;
        String mostFrequentString = null;
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {

            if (entry.getValue() > maxFrequency || entry.getValue() == maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentString = entry.getKey();            

            }

        }
        return mostFrequentString;      

        
    }

    public static String getName() {
        return "Collections Assignment";
    }
}
