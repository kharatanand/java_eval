package Constructor;

public class Constructor {
	String color;
	int cost;
	public Constructor(String clr, int cst)
	{
		color=clr;
		
		cost= cst;
	}
public void carDetails()
{
	System.out.println("Color of the car is "+ color);
	System.out.println("Cost of the car is "+cost);
}
}
