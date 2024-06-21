import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		 Thread th = new Thread(() -> System.out.println("in thread b"));
				
			
		
		 th.start();
		 System.out.println("In main thread");
		
	
	}

}
