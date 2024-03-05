package Methods;
//Method parameterization and return type demo for both static and non static methods.
public class Method_parameterization {
	public static void main(String[] args) {
		
		methodZero();
		methodOne(10,20);
		System.out.println(sum(10,20));
		
		Method_parameterization obj = new Method_parameterization();
		System.out.println(obj.sample("Kharat"));
	}
	 	
	public static void methodZero()
	{
		System.out.println("Method Zero");
	}
	
	public static void methodOne(int a, int b)
	{
		System.out.println("Parametrized Method One: "+ a +"& "+ b);
		
	}
	public static int sum(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	public String sample(String s11)
	{
		String s1= "Anand";
		return "Vinsol";
	}
}
