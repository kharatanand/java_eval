package Modifieers2;

import Modifiers1.demo1;

public class demo4 extends demo3 {

	public static void main(String[] args) {
		demo1 obj = new demo1();
		obj.sampleA();
		System.out.println("--------------------------");
	//	obj.methodA(); default not accessible in another package
		System.out.println("--------------------------");
		obj.methodB(); // inheritance from parent class or class where methods are inheriteded
	
		//obj.sample(); private method is not available in another class

	}

}
