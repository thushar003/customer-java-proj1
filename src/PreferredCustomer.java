/**
 * Class Name: PreferredCustomer.java
 * Coder: Thushar Joseph Joji, 1190586
 * Date: 19 Feb, 2024
 * Purpose: A child class of the RetailCustomer class, which is a child class of the Customer class. It implements it's own version of
 * 			the incentives() method and modifies how the toString() method is implemented.
 */
public class PreferredCustomer extends RetailCustomer {
	private int cashbackRate;
	
	public PreferredCustomer(String firstName, String lastName, String customerLevel, double totalPurchases, int cashbackRate)
	{
		super(firstName, lastName, customerLevel, totalPurchases);
		this.cashbackRate = cashbackRate;
	}

	public int getCashbackRate() {
		return cashbackRate;
	}

	public void setCashbackRate(int cashbackRate) {
		this.cashbackRate = cashbackRate;
	}
	
	/**
	 * Method name: incentives()
	 * Return type: double
	 * Accepts: Nothing
	 * Returns: A calculated value that is specific to the PreferredCustomer class
	 */
	public double incentives()
	{
		double incentive = super.incentives() + (this.getCashbackRate() / 100.0) * super.incentives();
		return incentive;
	}
	
	/**
	 * Method name: toString()
	 * Return type: String
	 * Accepts: Nothing
	 * Returns: A specialized description of the state and variables of the current PreferredCustomer object
	 */
	public String toString()
	{
		return super.toString() + String.format("%s:%10d%%\n", "Cashback Rate", this.getCashbackRate());
	}
	
}
