class Address {
	int streetNumber;
	int houseNumber;
	String areaName;
	String landmark;
	int pinNumber;
	String city;
	String state;
	String country;

	public Address(int streetNumber, int houseNumber, String areaName, String landmark, int pinNumber, String city,
			String state, String country) {
		this.streetNumber = streetNumber;
		this.houseNumber = houseNumber;
		this.areaName = areaName;
		this.landmark = landmark;
		this.pinNumber = pinNumber;
		this.city = city;
		this.state = state;
		this.country = country;
	}

}

public class Aggregation {
	int rollNumber;
	String studentName;
	Address studentAddress;

	public Aggregation(int rollNumber, String studentName, Address studentAddress) {
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public static void main(String[] args) {
		Address addr = new Address(12, 6, "Telipada", "MS Road", 476001, "Morena", "Madhya Pradesh", "India");

		Aggregation object = new Aggregation(101, "Yash Singhal", addr);

		System.out.println("Roll Number is: " + object.rollNumber);
		System.out.println("Student Name is: " + object.studentName);
		System.out.println("House Number is: " + object.studentAddress.houseNumber);
		System.out.println("Street Number is: " + object.studentAddress.streetNumber);
		System.out.println("Area Name is: " + object.studentAddress.areaName);
		System.out.println("Landmark is: " + object.studentAddress.landmark);
		System.out.println("Pin Numberis: " + object.studentAddress.pinNumber);
		System.out.println("City is is: " + object.studentAddress.city);
		System.out.println("State is: " + object.studentAddress.state);
		System.out.println("Country is: " + object.studentAddress.country);
	}

}

