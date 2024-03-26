package Casting;

public class UpcastingB extends UpcastingA {
	public void method() {
		System.out.println("This is method in UpcastingB class");
	}
	
	public static void main(String[] args) {
		
		UpcastingA ref = new UpcastingB();
		ref.sample();
		//ref.method();
	}

}
