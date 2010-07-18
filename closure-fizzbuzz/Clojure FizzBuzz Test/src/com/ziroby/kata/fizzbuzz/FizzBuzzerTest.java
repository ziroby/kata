package com.ziroby.kata.fizzbuzz;

import junit.framework.TestCase;

public class FizzBuzzerTest extends TestCase
{
    private void check(final String expected, final int number) {
        FizzBuzzer buzzer = new FizzBuzzer();
        String result = buzzer.convert(number);

        assertEquals(expected, result);
    }

    public void test1() throws Exception {
        check("1", 1);
    }

    public void test2() throws Exception {
        check("2", 2);
    }
    public void test3() throws Exception {
        check("fizz", 3);
    }
    public void test5() throws Exception {
        check("buzz", 5);
    }
    public void test6() throws Exception {
        check("fizz", 6);
    }
}
