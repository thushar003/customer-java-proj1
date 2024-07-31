/**
 * Class name: Customer.java
 * Coder: Thushar Joseph Joji, 1190586
 * Date: 19 Feb, 2024
 * Purpose: An abstract class that holds fields and methods that are common to all its subclasses.
 */

public abstract class Customer {
	private String firstName;
	private String lastName;
	private String customerID;
	private String customerLevel;
	
	public Customer(String firstName, String lastName, String customerLevel)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerLevel = customerLevel;
		this.setCustomerID();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCustomerID() {
		return customerID;
	}

	
	public void setCustomerID() {
		String custIDString = "";
		for (int i = 0; (this.lastName.length() < 4 ? i < this.lastName.length() : i < 4); i++)
		{
			custIDString += (this.lastName).charAt(i);
		}
		if (custIDString.length() < 4)
		{
			custIDString += 'X';
		}
		custIDString = custIDString.toUpperCase() + "-";
		for (int i = 0; i < 5; i++)
		{
			custIDString += "" + (int)(Math.random() * (10 - 1 + 1) + 1);
		}
		this.customerID = custIDString;
	}

	public String getCustomerLevel() {
		return customerLevel;
	}

	public void setCustomerLevel(String customerLevel) {
		this.customerLevel = customerLevel;
	}
	
	/**
	 * Method name: incentives()
	 * Return type: double
	 * Accepts: Nothing
	 * Returns: Nothing in this class, is an abstract method that should be implemented by all child classes
	 */
	public abstract double incentives();
	
	/**
	 * Method name: toString()
	 * Return type: String
	 * Accepts: Nothing
	 * Returns: A specialized description of the state and variables of the current Customer object
	 */
	public String toString()
	{
		return this.customerID + ", " + this.firstName + " " + this.lastName;
	}
}
