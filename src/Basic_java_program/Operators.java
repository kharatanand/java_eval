package Basic_java_program;

public class Operators {
	public static void main(String[] args) {
		int a= 10;
		int b= 52;
		int c1;
		int c2;
		int c3;
		int c4;
		int c5;
		c1=a+b;
		c2=b-a;
		c3=b%a;
		c4=b/a;
		c5= b*a;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		//relational Operators
		int x = 11;
		int y= 12;
		System.out.println(x==y);
		System.out.println(x!=y);
		System.out.println(x>=y);
		System.out.println(x<=y);
		
		//Logical Operator
		System.out.println(x!=y && x<y);
		System.out.println(x==y || x>y);
		
		//conditional operator
		Boolean z= (x==y)? true : false;
		System.out.println(z);
		String zz = (x==y) ? "This is equal" : "This is not equal" ;
		System.out.println(zz);
		
	}
	

}
