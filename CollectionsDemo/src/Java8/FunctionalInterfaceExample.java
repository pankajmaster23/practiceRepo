package Java8;

@FunctionalInterface
interface Sayable{
	  void say(String msg);  
	
}

public class FunctionalInterfaceExample implements Saybale{
	public static void main(String[] args) {
	     FunctionalInterfaceExample fie = new FunctionalInterfaceExample();  
	        fie.say("Hello there");  
	}

	@Override
	public void say(String message) {
		System.out.println(message);
		
	}
   
}
