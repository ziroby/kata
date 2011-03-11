package com.ziroby.kata.fizzbuzz;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;


public class TestFizzBuzz {
	@Test
	public void test1() throws Exception {
		check(1, "1");
	}

	private void check(int number, String expected) {
		FizzBuzzer fizzBuzzer = new FizzBuzzer();
		
		String result = fizzBuzzer.buzz(number);
		
		assertThat(result, is(expected));
	}
	
	@Test
	public void test2() throws Exception {
		check(2, "2");
	}
	
	@Test
	public void test3() throws Exception {
		check(3, "fizz");
	}
	
	@Test
	public void test5() throws Exception {
		check(5, "buzz");
	}
	@Test
	public void test6() throws Exception {
		check(6, "fizz");
	}
	@Test
	public void test10() throws Exception {
		check(10, "buzz");
	}
	@Test
	public void test15() throws Exception {
		check(15, "fizzbuzz");
	}
}
