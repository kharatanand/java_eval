package String;

public class WrapperClass {
	public static void main(String[] args) {
		String a = "150";
		int aref = Integer.parseInt(a)+50;
		System.out.println(aref);//200
		String b = "true";
		Boolean bref = Boolean.parseBoolean(b);
		Boolean bref1 = true;
		Boolean bref2 = bref && bref1;
		System.out.println(bref2);
		String C= "Anand27091998";
		String c1 = C.substring(9, 13);
		String c2= C.substring(0, 5);
		System.out.println(c1);
		int num= Integer.parseInt(c1);
		int years= (2000-num)+24;
		System.out.println("The age of "+c2+ " is "+ years);
		
	}

}
