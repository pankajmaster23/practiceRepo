import java.util.ArrayList;

public class ArrayList7 {
	
	
    public static void main(String[] args) {
		
    	String inputNumber = "411111111743643274";
		
    	String result =	trimToLastFourDigits(inputNumber);
    	
    	System.out.println(result);

	}
    
    public static String trimToLastFourDigits(String numberString) {
    	
    	
    	if (numberString == null || numberString.length() < 4) {
            return numberString;
        }
    	return numberString.substring(numberString.length() - 4);
    }
    
}