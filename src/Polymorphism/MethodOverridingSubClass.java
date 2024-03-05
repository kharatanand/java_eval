package Polymorphism;

public class MethodOverridingSubClass extends MethodOverridingSuperClass {
	public void methodA(int a) {
		System.out.println("This is method overriden");
	}
	public static void main(String[] args) {
		MethodOverridingSubClass abc = new MethodOverridingSubClass();
		abc.methodA(10);
		
	}

}

