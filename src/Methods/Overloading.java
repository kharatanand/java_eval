package Methods;

public class Overloading {
	
	public static void sample(int a, int b)
	{
		System.out.println("Different parameter");
	}
	public static void sample(int a, String b)
	{
		System.out.println("different parameter with diff data type");
	}
	public static void sample(String b, int a)
	{
		System.out.println("same parameter with diff order");
	}
	
	public static void main(String[] args) {
		sample(10,20);
		sample( 50, "Anand");
		sample("Anand", 50);
	}
}
