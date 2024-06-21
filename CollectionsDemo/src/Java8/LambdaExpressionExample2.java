package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Saybale {
	public void say(String message);
}

public class LambdaExpressionExample2 {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			
			public void run() {
				System.out.println("Thread is running");
				
			}
		};
		r.run();
		
		Thread t = new Thread(r);
		t.start();
		
		Runnable r2 = ()->System.out.println("hmmmm");
		Thread t2 = new Thread(r2);
		t2.start();
		}
	
	}

