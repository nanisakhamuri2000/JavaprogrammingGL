package com.as.globallogic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathutilsTest {

	MathUtils mathUtils;

	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
		System.out.println("Initializing Mathutils...");
	}

	@AfterEach
	void cleanup() {
		System.out.println("Cleaning up code...");
	}

	@Test
	void addTest() {
		int expected = 2;
		int actual = mathUtils.add(1, 1);

		assertEquals(expected, actual, "should return the right sum");
	}

	@Test
	void subtractTest() {
		int expected = 0;
		int actual = mathUtils.subtract(1, 1);

		assertEquals(expected, actual, "should return the right subtraction");
	}

	@Test
	void multiplyTest() {
		int expected = 2;
		int actual = mathUtils.multiply(2, 1);

		assertEquals(expected, actual, "should return the right sum");
	}

	@Test
	void divideTest() {
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by 0 should throw");
	}

	@Test
	void computeCircleAreaTest() {
		int radius = 10;
		double expected = Math.PI * radius * radius;
		double actual = mathUtils.computeCircleArea(radius);

		assertEquals(expected, actual, "should return the right Circle Area");
	}

	@Test
	void isEvenTest() {
		int num = 2;
		boolean isEven = mathUtils.isEven(num);
		assertEquals(true, isEven, "should return the correct value");
	}

}
