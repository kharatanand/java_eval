package Methods;

public class MethodUnderstanding {
	
	public static void main(String[] args) 
	{
		methodA();
		MethodUnderstanding.methodB();
		MethodUnderstanding methodc = new MethodUnderstanding();
		methodc.methodC();
	}
	
	
	public static void methodA()
	{
		String s = "Method A" ;
		System.out.println(s);
	} 
	public static void methodB()
	{
		String s = "Method B";
		System.out.println(s);
		methodD();
	}
	public void methodC()
	{
		String s = "Method C which is non static";
		System.out.println(s);
	}
	public static void methodD()
	{
		String s = "Method D";
		System.out.println(s);
	}
}
