package Modifiers;

public class demo{
	static int a=5;
	int b;
	int c;
	
	public void sum() {
		System.out.println("Instance variable and method");
	}
	public static void sample() {
		System.out.println("static variable and method");
	}
	
	
	public static void main(String[] args) {
		
		demo one =new demo();
		one.b=10;
		one.c=20;
		one.sum();
	
		System.out.println("--------------------------------------");
		
		demo two = new demo();
		two.b=11;
		two.c=21;
		two.sum();
		
		System.out.println("------------------------------------------");
		
		System.out.println(demo.a);
		demo.sample();
		
		
	}
}