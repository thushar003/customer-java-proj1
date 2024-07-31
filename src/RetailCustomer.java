/**
 * Class Name: RetailCustomer.java
 * Coder: Thushar Joseph Joji, 1190586
 * Date: 19 Feb, 2024
 * Purpose: A child class of the Customer superclass that has it's own version of the incentives() method, and other specifically calculated
 * 			values for the other methods, and has it's own version of the toString() method.
 */
public class RetailCustomer extends Customer {
	private double totalPurchases;
	
	public RetailCustomer(String firstName, String lastName, String customerLevel, double totalPurchases)
	{
		super(firstName, lastName, customerLevel);
		this.totalPurchases = totalPurchases;
	}

	public double getTotalPurchases() {
		return totalPurchases;
	}

	public void setTotalPurchases(double totalPurchases) {
		this.totalPurchases = totalPurchases;
		this.findDiscountRate();
	}
	
	public int findDiscountRate()
	{
		int discountRate = 0;
		if (this.totalPurchases > 10000)
		{
			discountRate = 15;
		}
		else if (this.totalPurchases > 5000)
		{
			discountRate = 10;
		}
		else if (this.totalPurchases > 1000)
		{
			discountRate = 5;
		}
		return discountRate;
	}
	
	/**
	 * Method name: incentives()
	 * Return type: double
	 * Accepts: Nothing
	 * Returns: A calculated value that is specific to the RetailCustomer class
	 */
	public double incentives()
	{
		double incentive = (this.totalPurchases * (double)(this.findDiscountRate() / 100.0));
		return incentive;
	}
	
	/**
	 * Method name: toString()
	 * Return type: String
	 * Accepts: Nothing
	 * Returns: A specialized description of the state and variables of the current RetailCustomer object
	 */
	public String toString()
	{
		return super.toString() + String.format("\n%s\n", this.getCustomerLevel())
				+ String.format("%s:%7s%,-10.2f\n", "Total Purchases", "$", this.getTotalPurchases())
				+ String.format("%s:%10d%%\n", "Discount Rate", this.findDiscountRate())
				+ String.format("%s:%4s%,-10.2f\n", "Discount Incentive", "$", this.incentives())
				+ String.format("%s:%9s%,-10.2f\n", "Net Purchases", "$", (this.getTotalPurchases() - this.incentives()));
	}
}
