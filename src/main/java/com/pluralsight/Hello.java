package com.pluralsight;

import java.util.Scanner;

public class Hello {


//            d. sayGoodMorning() that prints "Good morning!"
//    e. Call each method from main()
    // Creating main() method
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sayHello(scanner);
        sayGoodbye(scanner);
    }
    // sayHello() that prints "Hello, World!"
    static void sayHello(Scanner scanner) {
        System.out.print("Type \"Hello World!\": ");
        String userHelloWorld = scanner.nextLine();
    }
    // sayGoodbye() that prints "Goodbye!"
    static void sayGoodbye(Scanner scanner) {
        System.out.print("Type \"Goodbye!\": ");
        String userGoodbye = scanner.nextLine();
    }
}
