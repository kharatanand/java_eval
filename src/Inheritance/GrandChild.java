package Inheritance;

public class GrandChild extends Child {
	float a=1044f;
	
	public static void methodD()
	{
		System.out.println("This is method D of grand child ");
	}
	public static void main(String[] args) {
		Child ch = new Child();
		
		methodA();
		ch.methodB();
		ch.methodC();
		methodD();
	}

}
