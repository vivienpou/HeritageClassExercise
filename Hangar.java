public class Hangar
{
	public static void main(String[] args)
	{
		Car car = new Car("Clio", 1000);
		System.out.println(car.doStuff());
		Boat boat = new Boat("Queen Elizabeth 2", 0);
		System.out.println(boat.doStuff());
	}
}
