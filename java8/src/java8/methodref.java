package java8;
import java.lang.*;
interface Method{
	    public void display();
}

class Methodtwo{
	    public static void print() {
	    	    system.out.println("static reference");	    
	    }
}
public class Methodref{

	
	   public static void main(string args[]) {
		       thread obj=new thread(Methodtwo::print);
		       obj.start();
		       
		       
	   }
}