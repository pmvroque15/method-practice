package com.pluralsight;

public class CompareNumbers {
//    a. Create a main() method
    static void main(String[] args) {
        //e. Call these within a sout to view if your methods work or not. EX.
            // System.out.println(isEven(5)); should display false
        System.out.println(isEven(7));
        System.out.print(isPositive(-7));
    }
    // b. Create this method: isEven(int number)
    static boolean isEven(int number) {
        if (number % 2 == 0) {
            //    a. returns true if even
            return true;
        } else {
            return false;
        }
    }
    //    c. Create: isPositive(double number)
        //    d. returns true if > 0
    static boolean isPositive(double number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }
    }
}
