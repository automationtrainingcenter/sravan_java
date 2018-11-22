package encapsulation;
/*encapsulation means hiding data
 * Binding data and the operations we can perform on the data together
 * to hide the data or properties declare them using private access modifier
 * private variables can't be accessed outside the class
 * to add and retrieve the data of private variable create public setter and getter methods
 */

public class EncapsualationDemo {

	private int id;
	private String name;
	private String address;
	private double balance;

//	to set the data setter method
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance > 0) {
			this.balance += balance;
		}else {
			System.out.println("invalid amount");
		}
	}

	// to retrieve the data getter method
	public int getId() {
		return this.id;
	}

}
