import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListExample {

	public static void main(String[] args) {
		
        String arr[]  = {"Java","Python","PHP","C++"};  
        
        System.out.println(Arrays.toString(arr));
        
        
        System.out.println("_________________________________________________________________________________");
        
        List<String> list = new ArrayList<>();
        
        
        for (String lang : arr) {
			list.add(lang);
		}
        
        System.out.println();
        System.out.println(list);
	}

}
