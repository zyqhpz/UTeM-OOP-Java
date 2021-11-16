package mycustomer;
public class Car
{
	private int tire;     	
	private int door;		
	private String brand;	
	public String model;	 
	protected double price;	 
	
	public Car() // default constructor
	{
		
	}
	public Car(int tire, int door) //constructor overloading Car(in tire:int, in door:int)
	{
		this.tire = tire;
		this.door = door;
	}
	public Car(int tire, int door, String model, double price) //constructor overloading Car(in tire:int, in door:int, in model:String, in price:double)
	{
		this.tire = tire;
		this.door = door;
		this.model = model;
		this.price = price;
	}
	public int getTire()
	{
		return tire;
	}
	
	public int getDoor()
	{
		return door;
	}
	
	public void setBrand(String brand)
	{
		this.brand =brand;
	}
	public String getBrand()
	{
		return brand;
	}
	public String getModel()
	{
		return model;
	}
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
}