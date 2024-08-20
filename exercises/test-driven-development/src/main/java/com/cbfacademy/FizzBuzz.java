   
package com.cbfacademy;

// public class FizzBuzz {
//     public String printFizzBuzz(int num){
//         return "";
//     }

public class FizzBuzz {
    
    public static String get(int num) {

        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        }
        else if (num % 3 == 0) {
            return "Fizz";
        }

        else if (num % 5 == 0){
            return "Buzz";
        }         

        else {
            return String.valueOf(num);
        }

    }

}



// Create a class FizzBuzz with a get method that takes a number and returns a string, but such that:

// for multiples of 3, it returns “Fizz” instead of the number
// for multiples of 5, it returns “Buzz” instead of the number
// for multiples of 15, it returns “FizzBuzz” instead of the number
// the string representation of the number otherwise
