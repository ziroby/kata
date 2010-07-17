package com.ziroby.kata.fizzbuzz;

import junit.framework.TestCase;

public class FizzBuzzerTest extends TestCase
{
    public void test1() throws Exception {
        FizzBuzzer buzzer = new FizzBuzzer();
        String result = buzzer.convert(1);

        assertEquals("1", result);
    }
}
