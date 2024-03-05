package String;

public class StringMethods {
	public static void main(String[] args) {
		//Concatenation
		String s1= "Anand";
		String s2= " ";
		String s3= "Kharat";
		String s4= "Anand";
		String s5= "anand";
		
		String s= s1+s2+s3;
		System.out.println(s);
		
		//equal
			Boolean ss1= s1.equals(s3);
			System.out.println(ss1);
			
			System.out.println(s1.equals(s4));
			
			Boolean ss2= s1.equalsIgnoreCase(s5);
			System.out.println(ss2);
		
		//change to uppercase
			String ss3= s5.toUpperCase();
			System.out.println(ss3);
		
		//change to Lowercase
			String ss4= ss3.toLowerCase();
			System.out.println(ss4);
		
		//find length of char
			int a= s1.length();
			System.out.println(a);
		
		//find char at index
			
		
		//find index at char
			System.out.println(s1.indexOf(a));
		
		//replace char with another
			String ss6=s1.replace('a', 'b');
			System.out.println(ss6);
		//
	}

}
