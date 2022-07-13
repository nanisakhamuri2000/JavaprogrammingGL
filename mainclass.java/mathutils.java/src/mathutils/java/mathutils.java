package com.as.globallogic;

public class MathUtils {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public double computeCircleArea(double radius) {
		return Math.PI * radius * radius;
	}

	// write a code for checking the given number is even or odd then apply TDD on
	// that
	public boolean isEven(int a) {
		if (a % 2 == 0) {
			System.out.println("Even Number");
			return true;
		} else {
			System.out.println("Odd Number");
			return false;
		}
	}

}
