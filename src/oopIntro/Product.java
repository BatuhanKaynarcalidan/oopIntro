package oopIntro;

public class Product 
{
	int id;
	String name;
	String details;
	double UnitPrice;
	
	public Product() 
	{
		System.out.println("calistim");
		
	}
	public Product(int id , String name ,String details, double UnitPrice  ) 
	{
		this();
		this.id= id;
		this.name=name;
		this.details = details;
		this.UnitPrice = UnitPrice;
	}
	
	
}
