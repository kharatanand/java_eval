package Encapsulation;

public class Account {

	private double accountBalance;
	
	public void getviewAccountBalance()
	{
		this.accountBalance= accountBalance;
		System.out.println(accountBalance);
	}
	
	public double setaddMoneyViewBalance(double amt)
	{
		this.accountBalance= this.accountBalance+ amt;
		System.out.println(accountBalance);
		return accountBalance;
	}
	
	public static void main(String[] args) {
		
		Account obj = new Account();
		obj.accountBalance= 10000.0;
		obj.getviewAccountBalance();
		
		obj.setaddMoneyViewBalance(5000.0);
	}
}
