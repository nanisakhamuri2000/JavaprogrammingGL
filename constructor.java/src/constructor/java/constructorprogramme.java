import java.util.*;

public class constructorProgram {
	int empId =777;
	String empFname;
	String empLname;
	String location;
	int pincode;
	
	public constructorProgram(int empId, String empFname, String empLname, String location,int pincode) {
		this.empId = empId;
		this.empFname = empFname;
		this.empLname = empLname;
		this.location = location;
		this.pincode = pincode;
	}
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id: ");
		int empId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter First Name: ");
		String empFname = sc.nextLine();
		System.out.println("Enter last Name: ");
		String empLname = sc.nextLine();
		System.out.println("Enter Location: ");
		String location = sc.nextLine();
		System.out.println("Enter pincode: ");
		int pincode = sc.nextInt();
		
		constructorProgram obj = new constructorProgram(empId, empFname,empLname, location, pincode);
		
		System.out.println("Id is: "+empId);
		System.out.println("First Name is: "+empFname);
		System.out.println("Last Name is: "+empLname);
		System.out.println("Location is: "+location);
		System.out.println("pincode is: "+pincode);
		
		sc.close();
	}

}
