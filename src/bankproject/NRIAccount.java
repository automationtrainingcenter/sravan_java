package bankproject;

public class NRIAccount extends Account {

	public NRIAccount(String accHodlerName, String address, long phNum, String panNum) {
		super(accHodlerName, address, phNum, panNum);
	}

	public NRIAccount(String accHodlerName, String address, String aadharNum, long phNum) {
		super(accHodlerName, address, aadharNum, phNum);
	}
}
