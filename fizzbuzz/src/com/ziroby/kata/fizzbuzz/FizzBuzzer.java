package com.ziroby.kata.fizzbuzz;

public class FizzBuzzer {

	public String buzz(int number) {
		if (isDivisibleBy(number, 3 * 5))
			return "fizzbuzz";
		if (isDivisibleBy(number, 3))
			return "fizz";
		if (isDivisibleBy(number, 5))
			return "buzz";
		
		return Integer.toString(number);
	}

	private boolean isDivisibleBy(int number, int divisor) {
		return number % divisor == 0;
	}

}
