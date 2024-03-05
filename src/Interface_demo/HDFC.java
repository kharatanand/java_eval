package Interface_demo;

public class HDFC implements Bank {

	@Override
	public void accountDetails() {
		System.out.println("Account type is "+ accountType1);
		
	}

	@Override
	public void transferFunds() {
		System.out.println("Transfer funds from "+accountType1+" to "+ accountType2+ " successful.");
		
	}
	
	public static void main(String[] args) {
		
		HDFC obj = new HDFC();
		obj.accountDetails();
		obj.transferFunds();
	}
	

}
