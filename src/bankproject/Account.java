package bankproject;

public class Account {
	
	private int accNum;
	private String accHolderName;
	private String address;
	private String aadharNum;
	private String panNum;
	private double balance;
	private long phNum;
	private static String IFSCcode = "HDFC001";
	private static int increment  = 1000;
	
	private Account() {
		this.accNum += increment;
		this.balance = 10000;
		increment++;
	}
	
	private Account(String accHolderName, String address, long phNum) {
		this();
		this.accHolderName = accHolderName;
		this.address = address;
		this.phNum = phNum;
	}
	
	public Account(String accHolderName, String address, String aadharNum, long phNum) {
		this(accHolderName, address, phNum);
		this.aadharNum = aadharNum;
	}

	public Account(String accHodlerName, String address, long phNum, String panNum) {
		this(accHodlerName, address, phNum);
		this.panNum = panNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAadharNum() {
		return aadharNum;
	}

	public void setAadharNum(String aadharNum) {
		this.aadharNum = aadharNum;
	}

	public String getPanNum() {
		return panNum;
	}

	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}

	public long getPhNum() {
		return phNum;
	}

	public void setPhNum(long phNum) {
		this.phNum = phNum;
	}

	public int getAccNum() {
		return accNum;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public static String getIFSCcode() {
		return IFSCcode;
	}
	
//	deposite
	public void deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
		}else {
			System.out.println("invalid amount");
		}
	}
	
//	withdraw
	public double withdraw(double amount) {
		if(amount > 0 && amount < this.balance) {
			this.balance -= amount;
			return amount;
		}else {
			System.out.println("please check your amount");
			return 0;
		}
	}
	
	
	
	
	
	
	
	

}
