package bankproject;

public class NRIAccount extends Account {

	public NRIAccount(String accHodlerName, String address, long phNum, String panNum) {
		super(accHodlerName, address, phNum, panNum);
	}

	public NRIAccount(String accHodlerName, String address, String aadharNum, long phNum) {
		super(accHodlerName, address, aadharNum, phNum);
	}
	
	@Override
	public double withdraw(double amount) {
		if(amount > 0 && amount < this.balance  ) {
			this.balance -= amount+99;
			System.out.println("withdraw success. Please collect your cash");
			return amount;
		}else {
			System.out.println("please check your amount");
			return 0;
		}
		
	}
}
