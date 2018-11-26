package bankproject;

public class SavingsAccount extends Account {

	public SavingsAccount(String accHodlerName, String address, long phNum, String panNum) {
		super(accHodlerName, address, phNum, panNum);
	}

	public SavingsAccount(String accHodlerName, String address, String aadharNum, long phNum) {
		super(accHodlerName, address, aadharNum, phNum);
	}
}
