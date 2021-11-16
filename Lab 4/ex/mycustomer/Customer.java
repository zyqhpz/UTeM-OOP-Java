package mycustomer;
public class Customer
{
	private String id;
	private String name;
	private String email;
	private String tel; 
	private Address address; // a customer has an address
	private Car cars [] = new Car[10]; // a customer can buy more than 1 car.
	
	public Customer()
	{
				
	}
	public void setId(String id)
	{
		this.id = id;
	}
	
	public String getId()
	{
		return id;
	}
	public void setCars(Car cars[])
	{
		this.cars = cars;
	}
	public Car[] getCar()
	{
		return cars;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getEmail()
	{
		return email;
	}
	public void setTel(String tel)
	{
		this.tel = tel;
	}
	public String getTel()
	{
		return tel;
	}
	public void setAddress(Address address)
	{
		this.address = address;
	}
	public Address getAddress()
	{
		return address;
	}
	
	
}
