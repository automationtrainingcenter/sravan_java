package bankproject;

public class CurrentAccount extends Account {

	public CurrentAccount(String accHodlerName, String address, long phNum, String panNum) {
		super(accHodlerName, address, phNum, panNum);
	}

	public CurrentAccount(String accHodlerName, String address, String aadharNum, long phNum) {
		super(accHodlerName, address, aadharNum, phNum);
	}
}
