package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Basic Test Suite")
public class AppTest {

    @Test
    @DisplayName("creates the app")
    public void createsAnApp() {
        final App app = new App();

        assertThat(app, is(notNullValue()));
    }


    @Test
    @DisplayName("prints FizzBuzz if number divisible by 3 and by 5")
    public void printsFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.get(15));
    }

    @Test
    @DisplayName("prints Fizz if number divisible by 3")
    public void printsFizz() {
        assertEquals("Fizz", FizzBuzz.get(3));
    }


    @Test
    @DisplayName("prints Buzz if number divisible by 5")
    public void printsBuzz() {
        assertEquals("Buzz", FizzBuzz.get(5));
    }


    @Test
    @DisplayName("prints Number if number is not divisible by 3 or 5")
    public void printsNumber() {
        assertEquals("4", FizzBuzz.get(4));
    }

}