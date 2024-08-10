package com.fizzbuzz;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class AppTest {

    @Test
    public void testFizz() {
        assertEquals("Fizz", App.fizzBuzz(3));
        assertEquals("Fizz", App.fizzBuzz(6));
        assertEquals("Fizz", App.fizzBuzz(9));
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", App.fizzBuzz(5));
        assertEquals("Buzz", App.fizzBuzz(10));
        assertEquals("Buzz", App.fizzBuzz(20));
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", App.fizzBuzz(15));
        assertEquals("FizzBuzz", App.fizzBuzz(30));
        assertEquals("FizzBuzz", App.fizzBuzz(45));
    }

    @Test
    public void testNumber() {
        assertEquals("1", App.fizzBuzz(1));
        assertEquals("2", App.fizzBuzz(2));
        assertEquals("4", App.fizzBuzz(4));
    }
}
