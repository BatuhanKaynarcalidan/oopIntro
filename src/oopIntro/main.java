package oopIntro;

import java.util.Iterator;

public class main {

	public static void main(String[] args) 
	{
		Product product1 = new Product(0,"Laptop","16 GB Ram",25999);

		
		Product product2 = new Product();
		product2.id=1;
		product2.name="Tablet";
		product2.details="4 GB Ram";
		product2.UnitPrice=10000;
		
		Product product3 = new Product();
		product3.id=2;
		product3.name="Telefon";
		product3.details="8 GB Ram";
		product3.UnitPrice=15999;
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) 
		{
			System.out.println(product.name);
		}
		System.out.println(products.length);
		
		
		Category category1 = new Category();
		category1.id=0;
		category1.name="Ev Bahçe";
		
		Category category2 = new Category();
		category2.id=1;
		category2.name="Hobi";
		
		Category[] categories = {category1,category2};
		for (Category category : categories) 
		{
			System.out.println(category.name);
		}
		System.out.println(categories.length);
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
	}
}
