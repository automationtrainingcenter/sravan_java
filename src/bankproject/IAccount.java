package bankproject;

public interface IAccount {
	
	public void deposit(double amount);
	
	public double withdraw(double amount);
	
	public double getBalance();

}
