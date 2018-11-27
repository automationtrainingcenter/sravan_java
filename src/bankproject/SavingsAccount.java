package bankproject;

public class SavingsAccount extends Account {

	public SavingsAccount(String accHodlerName, String address, long phNum, String panNum) {
		super(accHodlerName, address, phNum, panNum);
	}

	public SavingsAccount(String accHodlerName, String address, String aadharNum, long phNum) {
		super(accHodlerName, address, aadharNum, phNum);
	}
	
	@Override
	public double withdraw(double amount) {
		if(amount > 0 && amount < this.balance) {
			this.balance -= amount;
			if(this.balance < 10000) {
				this.balance -= 50;
			}
			System.out.println("withdraw success. Please collect your cash");
			return amount;
		}else {
			System.out.println("please check your amount");
			return 0;
		}
		
	}
}
