package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}     
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case
        //  - it returns the constructed list

        List<String> result = new ArrayList <String>();

        for (int i=0; i<numbers.size(); i++) {
            if (numbers.get(i) % 3 == 0 && numbers.get(i) % 5 == 0) {
                result.add("FizzBuzz");
            }  

            else if (numbers.get(i) % 3 == 0) {
                result.add("Fizz");
            }

            else if (numbers.get(i) % 5 == 0){
                result.add("Buzz");
            }  

            else {
                 result.add(numbers.get(i).toString());            
            }            
            
            // else (numbers.get(i) % 3 != 0 && numbers.get(i) % 5 != 0) {
            //     result.add(numbers.get(i).toString());            
            // }  
        }              
        
        return result;
    }

    // public List<String> fizzBuzz(List<Integer> numbers) {
    //     //  it creates a list where for each element of the input list ${numbers}
    //     List<String> result = new ArrayList<>();
        
    //     for (int i = 0; i < numbers.size(); i++) {
    //         if (numbers.get(i) % 3 == 0 && numbers.get(i) % 5 == 0) {
    //             result.add("FizzBuzz");
    //         } else if (numbers.get(i) % 3 == 0) {
    //             result.add("Fizz");
    //         } else if (numbers.get(i) % 5 == 0) {
    //             result.add("Buzz");
    //         } else {
    //             result.add(numbers.get(i).toString());
    //         }
    //     }

    //     return result;
    // }

    // Compared to alternative solution using .forEach() with the lambda syntax:
    // public List<String> fizzBuzz(List<Integer> numbers) {
    //     List<String> strings = new ArrayList<String>();

    //     numbers.forEach(number -> {
    //         if (number % 5 == 0 && number % 3 == 0) {
    //             strings.add("FizzBuzz");
    //         } else if (number % 3 == 0) {
    //             strings.add("Fizz");
    //         } else if (number % 5 == 0) {
    //             strings.add("Buzz");
    //         } else {
    //             strings.add(number.toString());
    //         }
    //     });

    //     return strings;

    // }

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        throw new RuntimeException("Not implemented");
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        List<Integer> numberList = new ArrayList<>(100);
        // Initialize the list with numbers from 1 to 100

        for (int i = 1; i <= 100; i++) {
            numberList.add(i);
        }  

        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list

        int sumOfEvens = 0;
        int sumOfOdds = 0;     
        for (int number : numberList){    
            if (number % 2 == 0){
                sumOfEvens += number;
            }        
            else 
            {     
                sumOfOdds += number;
            }

        }    

        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        Map<String, Integer> resultMap = new TreeMap<>();
        resultMap.put("SumOfEvens", sumOfEvens);
        resultMap.put("SumOfOdds", sumOfOdds);  
        
        return resultMap;

//        throw new RuntimeException("Not implemented");
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        List<Integer> arrayList = new ArrayList<>(numbers);
    //    arrayList.add(10);
        // arrayList.add(1);
        // arrayList.add(15);
        // arrayList.add(5);
        // arrayList.add(3);
        // arrayList.add(25);
        // arrayList.add(99);

        //  - it returns the list in reverse order
        
        //        arrayList.sort(Comparator.reverseOrder());
        Collections.reverse(arrayList);

        return arrayList;

       // throw new RuntimeException("Not implemented");

    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
