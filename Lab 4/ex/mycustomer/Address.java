package mycustomer;
public class Address
{
	
	private String houseNumber;
	private String road;
	private String place;
	private int postcode;
	
	public Address()
	{}
	
	public void setHouseNumber(String houseNumber)
	{
		this.houseNumber = houseNumber;
	}
	public String getHouseNumber()
	{
		return houseNumber;
	}
	public void setRoad(String road)
	{
		this.road = road;
	}
	public String getRoad()
	{
		return road;
	}
	public void setPlace(String place)
	{
		this.place = place;
	}
	public String getPlace()
	{
		return place;
	}
	public void setPostcode(int postcode)
	{
		this.postcode = postcode;
	}
	public int getPostcode()
	{
		return postcode;
	}
}