package Modifiers;

public class Stadium extends Vinsol {

	@Override
	public void simple() {
		System.out.println("This is incomple method body of abstract class Vinsol");
		
	}
	
	public static void main(String[] args) {
		Stadium a = new Stadium();
		
		a.simple();
		a.method();
		Vinsol.sample();
		
	}
	

}
