package Java8;

import java.lang.System.Logger;

interface Drawable
{
	public void draw();
}


public class LambdaExpressionExample{

	
	public static void main(String[] args) {
		int width = 10;
		 
		Drawable d = () -> System.out.println("Heyyyyyyy");
			
		
		System.out.println("Hello");
		
	 
	}
	
}
