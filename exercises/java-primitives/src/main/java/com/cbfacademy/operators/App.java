// package com.cbfacademy.operators;

// public class App {
//     public static void main(String[] args) {
//         System.out.println("Hello World!");
//     }

//     public static double add(double operand1, double operand2) {
//         throw new RuntimeException("Not implemented");
//     }

//     public static double subtract(double operand1, double operand2) {
//         throw new RuntimeException("Not implemented");
//     }

//     public static double multiply(double operand1, double operand2) {
//         throw new RuntimeException("Not implemented");
//     }

//     public static Boolean areEqual(double operand1, double operand2) {
//         throw new RuntimeException("Not implemented");
//     }

//     public static Boolean isLessThan(double operand1, double operand2) {
//         throw new RuntimeException("Not implemented");
//     }

//     public static Boolean isMoreThan(double operand1, double operand2) {
//         throw new RuntimeException("Not implemented");
//     }
// }

package com.cbfacademy.operators;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int number1 = 12;
        int number2 = 12;
        
        System.out.println("number1++ = " + number1++); // 12 - does the addition but does not print it out
        System.out.println(number1); // prints 13
//        System.out.println("+number1 = " + +number1); // 12
        // System.out.println("++number1 = " + ++number1); // 13        
        // System.out.println("-number2 = " + -number2); // -12
        // System.out.println("--number2 = " + --number2); // 11

    }

    // Arithmetic operators
    public static double add(double operand1, double operand2) {
        return operand1 + operand2;
    }

    public static double subtract(double operand1, double operand2) {
        return operand1 - operand2;
    }

    public static double multiply(double operand1, double operand2) {
        return operand1 * operand2;
    }

    // Relational operators

    public static Boolean areEqual(double operand1, double operand2) {
        return operand1 == operand2;
    }

    public static Boolean isLessThan(double operand1, double operand2) {
        return operand1 < operand2;
    }

    public static Boolean isMoreThan(double operand1, double operand2) {
        return operand1 > operand2;
    }

    // Unary operators

    // What do the following expressions evaluate to:

    public static void unary () {
    int number1 = 12;
    int number2 = 12;
    
    System.out.println(number1++); // 14
    System.out.println(++number2); // ++12

    }
    


}

