import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
     public static void main(String[] args) {
	  LinkedList<String> list = new LinkedList<>();
	  list.add("Ravi");
	  list.add("vijay");
	  list.add("ajay");
	 
	  
	  
	 
	  
	  
	  Iterator itr = list.descendingIterator();
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
	}
}
