class Teacher{
	String designation = "Teacher";
	String collegeName ="Arya Institute of Engineering and Technology";
	
	void  does() {
		System.out.println("Teaching");
	}
}


public class Is_A_Relationship extends Teacher{

	String mainSubject = "Physics";
	String designation = "Principle";
	
	public static void main(String[] args) {
		Is_A_Relationship instance = new Is_A_Relationship();
		
		System.out.println("");

	}

}
