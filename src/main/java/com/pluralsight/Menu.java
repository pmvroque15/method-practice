package com.pluralsight;

import java.util.Scanner;

public class Menu {

//        4. 5. 1. 2. Create a new file named Format.java
//        a. Create a main() method
//        a. Create this method: formatName(String first,
//                String last)
//        b. It should RETURN "Last, First" format
//        b. Example: formatName("Bob", "Smith") returns "Smith, Bob"
//        c. Call it in your main and put it in the () of a System.out.println(). Bonus:
//        set the return of the method call in a variable and print that!
//        a. Create main() method
    static void main(String[] args) {
        //Initialize Scanner
        Scanner scanner = new Scanner(System.in);
        //Declare methods
//        c. Call it twice from main() to see it's reusable
        displayMenu();
        displayMenu();
    }

    //        b. Create a method called displayMenu() that prints:
        //        "=== MENU ==="
        //        "1. Coffee - $3.99"
        //        "2. Tea - $2.99"
        //        "3. Cookie - $1.99"
    static void displayMenu() {
        String menuItems =
                """
                === MENU ===
                1. Coffee - $3.99
                2. Tea - $2.99
                3. Cookie - $1.99
                """;
        System.out.println(menuItems);
    }
}
