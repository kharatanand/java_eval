package Constructor;

public class ConstructorTypes {
	
public ConstructorTypes()
{
	System.out.println("This zero argument constructor");
}
public ConstructorTypes(int a, int b)
{
	int sum= a+b;
	System.out.println("The sum is "+sum);
	sample();
}
public void sample()
{
	System.out.println("This is a simple method");
}
public static void main(String[] args) {
	ConstructorTypes cc= new ConstructorTypes();
	ConstructorTypes ccc= new ConstructorTypes(10,20);
	
}
}
