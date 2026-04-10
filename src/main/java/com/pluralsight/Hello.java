package com.pluralsight;

import java.util.Scanner;

public class Hello {
    // Creating main() method
        // Call each method from main()
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        sayHello(scanner);
        sayGoodbye(scanner);
        sayGoodMorning(scanner);
    }
    // sayHello() that prints "Hello, World!"
    static void sayHello(Scanner scanner) {
        System.out.print("Type \"Hello World!\": ");
        String userHelloWorld = scanner.nextLine();

        System.out.println("You typed: " +userHelloWorld);
    }
    // sayGoodbye() that prints "Goodbye!"
    static void sayGoodbye(Scanner scanner) {
        System.out.print("Type \"Goodbye!\": ");
        String userGoodbye = scanner.nextLine();

        System.out.println("You typed: " + userGoodbye);
    }
    // sayGoodMorning() that prints "Good morning!"
    static void sayGoodMorning(Scanner scanner) {
        System.out.print("Type \"Good morning\": ");
        String userGoodMorning = scanner.nextLine();

        System.out.println("You typed: " + userGoodMorning);
    }
}
