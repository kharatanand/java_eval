package Object;

public class Car {
	String color;
	String model;
	float milage;
	int cost;
	public void startCar()
	{
		System.out.println("the "+model+" car with "+ color+ " color started with "+ milage+ " KMPH" );
	}
	public void carDetails()
	{
		System.out.println("Model is "+ model);
		System.out.println("Color of car is "+ color);
		System.out.println("milage and cost of the car are "+milage +" KMPH and "+ cost+ " lakh respectively");
	}
	public static void example()
	{
		System.out.println("This is an example");
	}
}
