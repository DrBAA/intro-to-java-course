// package com.cbfacademy.strings;

// public class App {

//     public static void main( String[] args ) {
//         System.out.println( "Hello World!" );
//     }

//     public static String concatenate(String word1, String word2, String word3) {
//         String method1 = word1.concat(word2).concat(word3);
//         // String method2 = word1 + " " + word2 + " " + word3;
//         // String method3 = String.join(" ", word1, word2, word3);
//         // System.out.println(word1.concat(word2).concat(word3));
//         return method1; // + method2 + method3;
//     }

//     public static Boolean areEqual(String word1, String word2) {
//         System.out.println(word1.equals(word2));
//         return word1.equals(word2);
//     }

//     public static String format(String item, int quantity, double price) {
//         // Implement the format method, which returns a formatted string containing the provided parameters. The price value should be displayed with a pound (£) symbol and two decimal places.
//         // For example
//         // String lineItem = format("Apple iPhone 15 Pro", 47, 1199.99);
// //        System.out.println(lineItem); // Output: Item: Apple iPhone 15 Pro. Price: £1199.99. Quantity: 47
// //       String lineItem = format("Apple iPhone 15 Pro", 47, 1199.99);
//        System.out.println("Item: %s. Price: £%.2f. Quantity: %d");
//         return String.format("Item: %s. Price: £%.2f. Quantity: %d",item,price,quantity);

//     }
// }

package com.cbfacademy.strings;
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }
    public static String concatenate(String word1, String word2, String word3) {
        return word1.concat(word2).concat(word3);
        // return word1 + " " + word2 + " " + word3;
        // return String.join(" ", word1, word2, word3);
    }
    public static Boolean areEqual(String word1, String word2) {
        return word1.equals(word2);
    }
    public static String format(String item, int quantity, double price) {
        return String.format("Item: %s. Price: £%.2f. Quantity: %d",item,price,quantity);
    }

}

