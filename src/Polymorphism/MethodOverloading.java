package Polymorphism;

public class MethodOverloading 
{

	public int methodA(int a, int b)
	{
		System.out.println("This is method A with sum of two numbers is "+ (a+b));
		return (a+b);
	}
	
	public float methodA(float a, float b)
	{
		System.out.println("This is method A with subtraction of two numbers is "+ (a-b));
		return (a-b);
	}
	
	public static void main(String[] args) {
		MethodOverloading a = new MethodOverloading();
		a.methodA(30.5f, 10.5f);
		a.methodA(10,20);
	}
}
