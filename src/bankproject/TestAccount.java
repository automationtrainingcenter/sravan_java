package bankproject;

public class TestAccount {
	public static void main(String[] args) {
		Account account = new SavingsAccount("sravan", "chandanagar", 9876543210l, "pan1234");
		System.out.println(account.getBalance());
		account.deposit(9000);
		System.out.println(account.getBalance());
		account.withdraw(20000);
		System.out.println(account.getBalance());
		account.withdraw(-2000);
		System.out.println(account.getBalance());
		account.withdraw(2000);
		System.out.println(account.getBalance());
		
	}
}
