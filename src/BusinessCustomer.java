/**
 * Class Name: BusinessCustomer.java
 * Coder: Thushar Joseph Joji, 1190586
 * Date: 19 Feb, 2024
 * Purpose: A child class of the Customer class that implements it's own version of the incentives() method, and other methods,
 * 			along with it's own version of the toString() method.
 */
public class BusinessCustomer extends Customer {
	private String companyName;
	private int discountRate;
	private double totalPurchases;
	
	public BusinessCustomer(String firstName, String lastName, String customerLevel, String companyName, int discountRate, double totalPurchases)
	{
		super(firstName, lastName, customerLevel);
		this.companyName = companyName;
		this.discountRate = discountRate;
		this.totalPurchases = totalPurchases;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public double getTotalPurchases() {
		return totalPurchases;
	}

	public void setTotalPurchases(double totalPurchases) {
		this.totalPurchases = totalPurchases;
	}
	
	/**
	 * Method name: incentives()
	 * Return type: double
	 * Accepts: Nothing
	 * Returns: A calculated value that is specific to the BusinessCustomer class
	 */
	public double incentives()
	{
		double incentive = (this.totalPurchases * (double)(this.discountRate / 100.0));
		return incentive;
	}
	
	/**
	 * Method name: toString()
	 * Return type: String
	 * Accepts: Nothing
	 * Returns: A specialized description of the state and variables of the current BusinessCustomer object
	 */
	public String toString()
	{
		return super.toString() + String.format("\n%s\n", this.getCustomerLevel())
				+ String.format("%s:%7s%,-10.2f\n", "Total Purchases", "$", this.getTotalPurchases())
				+ String.format("%s:%10d%%\n", "Discount Rate", this.getDiscountRate())
				+ String.format("%s:%4s%,-10.2f\n", "Discount Incentive", "$", this.incentives())
				+ String.format("%s:%9s%,-10.2f\n", "Net Purchases", "$", (this.getTotalPurchases() - this.incentives()));
	}
}
