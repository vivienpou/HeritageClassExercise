public class Boat extends Vehicle
{
	public Boat(String brand, Integer kilometers)
	{
		super(brand, kilometers);
	}

	@Override
	public String doStuff()
	{
		return "I am "+this.brand+ " and I go glug glug!";
	}
}
