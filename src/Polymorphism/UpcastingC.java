package Casting;

public class UpcastingC extends UpcastingB {
	
	public void Simpel() {
		System.out.println("This is method in UpcastingC class");
	}
	public static void main(String[] args) {
		UpcastingC ref = new UpcastingC();
		ref.sample();
		ref.method();
		ref.Simpel();
		
	}

}
