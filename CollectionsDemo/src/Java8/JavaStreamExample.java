package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product1 {
	int id;
	String name;
	float price;

	public Product1(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class JavaStreamExample {
	public static void main(String[] args) {
		List<Product1> productsList = new ArrayList<Product1>();

		productsList.add(new Product1(1, "HP Laptop", 25000f));
		productsList.add(new Product1(2, "Dell Laptop", 30000f));
//		productsList.add(new Product1(3, "Lenevo Laptop", 28000f));
//		productsList.add(new Product1(4, "Sony Laptop", 29000f));
		productsList.add(new Product1(5, "Apple Laptop", 90000f));
	
		   Product1 productA = productsList.stream()
		            .max((e1,e2)->e1.price > e2.price?1:-1).get();
		            System.out.println(productA.price);
		            
		            Product1 productB = productsList.stream().min((product1, product2)->product1.price > product2.price ? 1: -1).get();    
		            System.out.println(productB.price);    

	}
}
