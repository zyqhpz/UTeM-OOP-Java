package mycustomer;
public class MalaysianCar extends Car
{
	protected String color;
	
	
	public MalaysianCar()
	{
		super();
	}
	
	public MalaysianCar(int tire, int door, String model, String color, double price)
	{
		super(tire, door, model, price);
		this.color = color;
	}
	
	
	public String getColor()
	{
		return color;
	}
	
	//method overriding. Set the MalaysiaCar for 5% discount
	public void setPrice(double price)
	{
		super.price =price*0.95; 
	}	
}