package com.pluralsight;

import java.util.Scanner;

public class Menu {

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
