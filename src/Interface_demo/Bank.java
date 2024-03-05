package Interface_demo;

public interface Bank {

	String accountType1= "Saving";
	String accountType2= "Current";
	
	void accountDetails();
	void transferFunds();
	public static void method()
	{
		System.out.println("Complete method in interface");
	}

}
