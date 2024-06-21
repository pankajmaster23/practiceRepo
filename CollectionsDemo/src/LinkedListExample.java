import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Book{
	int id;
	String name;
	String author;
	String publisher;
	int quantity;
	
	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
				+ quantity + "]";
	}
	
   
}

public class LinkedListExample {

	public static void main(String[] args) {
		 
		List<Book> bookList = new LinkedList<>();
		
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
	    
	    bookList.add(b1);
	    bookList.add(b2);
	    bookList.add(b3);
	    
	    
//	    for (Book books : bookList) {
//			System.out.println(books.author+" "+books.id+" "+books.name+" "+books.publisher+" "+books.quantity);
//		}
	    
	   Iterator itr = bookList.iterator();
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
	   }

	}

}
