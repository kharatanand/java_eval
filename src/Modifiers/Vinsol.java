package Modifiers;

public abstract class Vinsol {
	 final static String type = "Product Base Software Company";
	
	 public static void sample() {
		 
	//	 type= "Service base";
		 System.out.println(type);
		 System.out.println("This is static method of abstract class");
	 }
	 
	 public abstract void simple();
	 
	 public void method() {
		 System.out.println("This is complete method from abstract class");
	 }

}
