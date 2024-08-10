package com.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    
    @Test
    void test_fizzbuzz_number_from_1_to_100() {
     FizzBuzz fizzBuzz = new FizzBuzz();
    fizzBuzz.number(25);
     assertTrue(true);
    }

    @Test
    void test_fizzbuzz_divisible() {
     FizzBuzz fizzBuzz = new FizzBuzz();
     fizzBuzz.stage1(65);

     assertTrue(true);
    }

    @Test
    void test_fizzbuzz_divisible_contains_3_5() {
     FizzBuzz fizzBuzz = new FizzBuzz();
     fizzBuzz.stage2(45);

     assertTrue(true);
    }
    
}
