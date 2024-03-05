package Inheritance;

public class Child extends Parent {
	String a= "Child";
	
	public void methodC()
	{
		System.out.println("This is method C of child");
	}
	
	public static void main(String[] args) {
		methodA();
		
		Child abc = new Child();
		abc.methodB();
		
		abc.methodC();
		
	}

}
