package com.pluralsight;

import java.util.Scanner;

public class Hello {

//            c. sayGoodbye() that prints "Goodbye!"
//            d. sayGoodMorning() that prints "Good morning!"
//    e. Call each method from main()
    // Creating main() method
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sayHello(scanner);
    }
    // sayHello() that prints "Hello, World!"
    static void sayHello(Scanner scanner) {
        System.out.print("Type \"Hello World!\": ");
        String userHelloWorld = scanner.nextLine();
    }
}
