package bankproject;

public class TestAccount {
	public static void main(String[] args) {
		IAccount account = new SavingsAccount("sravan", "chandanagar", 9876543210l, "pan1234");
		System.out.println(account.getBalance());
		account.deposit(9000);
		System.out.println(account.getBalance());
		account.withdraw(10000);
		System.out.println(account.getBalance());
		account.withdraw(-2000);
		System.out.println(account.getBalance());
		account.withdraw(2000);
		System.out.println(account.getBalance());
		
	}
}
