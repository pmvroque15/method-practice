package com.pluralsight;
// Create a new file named Format.java
public class Format {
    // Create a main() method
    static void main(String[] args) {
        System.out.print(formatName("Pat","Roque"));
    }
    // Create this method: formatName(String first,String last)
    static String formatName(String first,String last) {
        // It should RETURN "Last, First" format
        // Example: formatName("Bob", "Smith") returns "Smith, Bob"
        // Call it in your main and put it in the () of a System.out.println()
        // Bonus: set the return of the method call in a variable and print that!
        return first + " " + last;
    }

}


