import java.util.*;

class Derivedclass extends MainClass {
	// check the number is even or not
	void isNumEven(int num) {
		if (num % 2 == 0)
			System.out.println("Number is even");

		else
			System.out.println("Number is odd");
	}

	// check the number is even or odd in the first 20 numbers
	void evenOrOdd() {
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}
		}
	}

	// max of 3 numbers
	void maxOf3(int numberOne, int numberTwo, int numberThree) {
		if (numberOne >= numberTwo && numberOne >= numberThree) {
			System.out.println("1st number is the greatest");
		} else if (numberTwo >= numberThree && numberTwo >= numberOne) {
			System.out.println("2nd number is the greatest");
		} else if (numberThree >= numberOne && numberThree >= numberTwo) {
			System.out.println("3rd number is the greatest");
		}
	}

	// Check if the person is eligible for vote
	void isEligible(int age) {
		if (age >= 18)
			System.out.println("Eligible to vote");

		else
			System.out.println("Not eligible to vote.");
	}
}

public class MainClass {

	// Main Method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if the number is even or odd: ");
		int num = sc.nextInt();

		Derivedclass logic = new Derivedclass();

		logic.isNumEven(num);
		System.out.println();
		System.out.println("First 20 number is even or odd: ");
		logic.evenOrOdd();
		System.out.println();
		System.out.println("Enter 3 numbers to check the greatest among them ---- ");
		System.out.println("Enter 1st Number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter 3rd Number: ");
		int num3 = sc.nextInt();
		logic.maxOf3(num1, num2, num3);
		System.out.println();
		System.out.println("Enter the age to check if the person is eligible to vote or not: ");
		int age = sc.nextInt();
		logic.isEligible(age);

		sc.close();

	}

}
