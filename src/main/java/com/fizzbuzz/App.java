package com.fizzbuzz;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = 0;
                
        do {
            System.out.println("Write a number from 1 to 100: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number < 1 || number > 100) {
                    System.out.println("Please, the number should be in the range of 1 to 100.");
                }
            } else {
                System.out.println("Invalid entry. Please enter a number.");
                scanner.next();
            }
        } while (number < 1 || number > 100);

        System.out.println("Outcome: " + fizzBuzz(number));
        scanner.close();
    }

    public static String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }
}
