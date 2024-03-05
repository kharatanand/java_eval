package Modifiers1;

//private: can access only in a class
//public: can access inside/outside class with same or diff packages by importing if needed
public class demo1 {
		private static int a=10;
		public static int b=20;
		static int c=30;
		protected static int d =40;
		
	private static void sample() {
		System.out.println("Private method from Demo1 class with variable value ");
		System.out.println(a);
	}

	public static void sampleA() {
		System.out.println("Public method from Demo1 class with variable value ");
		System.out.println(b);
	}
	
	static void methodA() {
		System.out.println("Default method from demo1 class");
		System.out.println(c);
	}
	
	protected static void methodB() {
		System.out.println("Protected method from demo1 class");
		System.out.println(d);
	}
	public static void main(String[] args) {
		
		sample();
		System.out.println("--------------------------");
		sampleA();
		System.out.println("--------------------------");
		methodA();
		System.out.println("--------------------------");
		methodB();

	}

}
