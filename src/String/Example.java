package Exceptions;

public class Example {
	public static void main(String[] args) {
		// int a = "Anand";
		int a = 10;
		System.out.println("Before exception");
		
		
		try{
			int b = a/0;
		System.out.println(b);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled inside catch block internally");
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("After exception");
	}

}
