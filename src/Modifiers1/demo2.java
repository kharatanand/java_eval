package Modifiers1;

public class demo2 {
	public static void main(String[] args) {
		demo1 obj = new demo1();
		obj.sampleA();
		System.out.println("--------------------------");
		obj.methodA();
		System.out.println("--------------------------");
		obj.methodB();
	
		//obj.sample(); private method is not available in another class
	}

	
}
