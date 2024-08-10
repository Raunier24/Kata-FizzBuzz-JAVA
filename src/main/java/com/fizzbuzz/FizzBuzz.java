package com.fizzbuzz;

import java.util.Scanner;

public class FizzBuzz {
    public void number(int par) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number from 1 to 100:");
        
        
        int number = scanner.nextInt();

        
        if (number < 1 || number > 100) {
            System.out.println("The number should be in the range of 1 to 100.");
        } else {
            System.out.println("stage 1:");
            stage1(number);
            System.out.println("\nStage 2:");
            stage2(number);
        }

        scanner.close();
    }

    
    public static void stage1(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }

    
    public static void stage2(int i) {
        boolean divisibleBy3 = (i % 3 == 0);
        boolean divisibleBy5 = (i % 5 == 0);
        boolean contains3 = Integer.toString(i).contains("3");
        boolean contains5 = Integer.toString(i).contains("5");
        
        if ((divisibleBy3 || contains3) && (divisibleBy5 || contains5)) {
            System.out.println("FizzBuzz");
        } else if (divisibleBy3 || contains3) {
            System.out.println("Fizz");
        } else if (divisibleBy5 || contains5) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }

    void notify(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}