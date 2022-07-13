package exceptions;

public class Throwzz{
	static void eligible(int age) {
		try {
			   if(age<12) {
				       throw new ArithemeticException("INVALID");
			   }
			   else {
				   System.out.println("VALID");			   
			   }
		}
		finally {
			    java.lang.System.out.println("dgdwguywe");
		}
		public static void main(string args[]) {
			    eligible(11)
		}
	}
