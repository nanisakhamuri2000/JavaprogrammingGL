package java8;
interface hero{
	    Message getMessage(string s);
}
class Message{
	   Message(string str){
		       System.out.println(str);
		       
	   }
}
public class constref {

	   public static void main(String args[]) {
		       hero obj=Message::new;
		       obj.getMessage("HI EVERYONE");
		// TODO Auto-generated method stub

	}

}
