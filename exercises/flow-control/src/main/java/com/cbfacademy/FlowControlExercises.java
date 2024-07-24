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

        // EXAMPLE 1 - USING AN ARRAY PLUS AN IF AND ELSE STATEMENT - WORKS
        // In this example
        // We create an array months where each index corresponds to a month (index 0 is not used).
        // If the input number is within the valid range (1 to 12), we return the corresponding month name.
        // Otherwise, we return “Invalid month number”.
        // Input: whichMonth(3) Output: March
        // Input: whichMonth(13) Output: Invalid month number
        String[] months = {
            null, // Index 0 is not used
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
    
        if (number >= 1 && number <= 12) {
            return months[number];
        } else {
            return "Invalid month number";
        }


        // USING  A SWITCH CASE STATEMENT - ALSO WORKS
        // In this example:
        // We use a switch statement to handle each possible input value.
        // If the input number matches one of the cases (1 to 12), we return the corresponding month name.
        // Otherwise, we return “Invalid month number”.
/*
        switch (number) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month number";
        }
*/                
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
