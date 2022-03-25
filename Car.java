public class Car extends Vehicle
{
	public Car(String brand, Integer kilometers)
	{
		super(brand, kilometers);
	}

	@Override
	public String doStuff()
	{
		return "I am " + this.brand + " and I go zoom zoom zoom!";
	}
}
