package Modifieers2;

import Modifiers1.demo1;

public class demo3 extends demo1{

	public static void main(String[] args) {
		demo1 obj = new demo1();
		obj.sampleA();
		System.out.println("--------------------------");
		//obj.methodA(); default not accesible
		//obj.sample(); private not accesiable
		obj.methodB(); //by inheritance
	}
}
