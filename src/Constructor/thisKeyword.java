package Constructor;

public class thisKeyword {
	static int a;
	static int b;
	String s;
	public thisKeyword(int a1, int b1)
	{
		this.a=10;
		this.b=20;
		
	//	a= a1;
	//	b=b1;

	}


	public static void main(String[] args) {
		thisKeyword abc = new thisKeyword(30,20);
		int c= a+b;
		System.out.println("Simple without this keyword " + c);
		
		
	}
}
