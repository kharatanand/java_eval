package Constructor;

public class DemoConstructor {
	public static void main(String[] args) {
		//Constructor bmw = new Constructor();
		Constructor audi = new Constructor("White", 500000);
		//bmw.color= "Black";
	//	bmw.cost= 1000000;
	//	bmw.carDetails();
		
		System.out.println("----------------------------------------");
		
	//	audi.color= "White";
	//	audi.cost= 500000;
		audi.carDetails();
	}

}
