package Object;

public class DemoClassCar {
public static void main(String[] args) {
	
	
	Car suv = new Car();
	suv.color= "Black";
	suv.milage= 22.5f;
	suv.cost= 13;
	suv.model= "Creta";
	//suv.example();
	suv.startCar();
	suv.carDetails();
}
}