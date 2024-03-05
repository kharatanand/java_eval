package Inheritance;

public class ChildTwo extends Parent {
	public static void methodE()
	{
		System.out.println("This is method E of another child");
	}

	public static void main(String[] args) {
methodA();
		
		Child abc = new Child();
		abc.methodB();
		
		methodE();
	}
	
}
