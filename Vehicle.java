public abstract class Vehicle
{
	String brand;
	Integer kilometers;

	public void setKilometers(Integer kilometers)
	{
		this.kilometers = kilometers;
	}

	public Integer getKilometers()
	{
		return kilometers;
	}

	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	public String getBrand()
	{
		return brand;
	}

	public Vehicle(String brand, Integer kilometers)
	{
		this.brand = brand;
		this.kilometers = kilometers;
	}

	public abstract String  doStuff();
}

