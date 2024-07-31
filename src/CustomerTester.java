/**
 * Program Name: CustomerTester.java
 * Coder: Thushar Joseph Joji, 1190586
 * Date: Feb 19, 2024
 * Purpose: 
 */
public class CustomerTester {
	public static void main(String[] args) {
		//Print out the heading and purpose of the program
		System.out.println("Welcome to the Customer tester!");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("This program will instantiate objects of the Customer hierarchy and test their methods");
		System.out.println("---------------------------------------------------------------------------------------");
		
		//Create an array of Customer objects
		Customer customerArray[] = new Customer[3];
		
		//Instantiate Customer objects in such a way that demonstrates polymorphism, defining them as Customer objects then instantiating as the child class
		Customer mikeHolmes = new BusinessCustomer("Mike", "Holmes", "Business Customer", "Home Depot", 10, 3105.50);
		Customer devGelda = new RetailCustomer("Dev", "Gelda", "Retail Customer", 11200);
		Customer weiPing = new PreferredCustomer("Wei", "Ping", "Preferred Customer", 6456.85, 5);
		
		//Set the Customer objects into the array
		customerArray[0] = mikeHolmes;
		customerArray[1] = devGelda;
		customerArray[2] = weiPing;
		
		//Print out the elements in the array
		for (Customer c : customerArray)
		{
			System.out.println(c);
		}
		System.out.println();
		
		//Print out a description of what the discount incentive earned by each customer object is
		for (Customer c : customerArray)
		{
			System.out.println(c.getFirstName() + " " + c.getLastName() + " earns a discount incentive of $" + c.incentives());
		}
		System.out.println();
		
		//Instantiate three more objects that are defined as objects of the child class instead of the superclass
		BusinessCustomer tristanLee = new BusinessCustomer("Tristan", "Lee", "Business Customer", "Starbucks", 15, 9875.25);
		RetailCustomer carlosBeltran = new RetailCustomer("Carlos", "Beltran", "Retail Customer", 3100.50);
		PreferredCustomer artiPatel = new PreferredCustomer("Arti", "Patel", "Preferred Customer", 10450.00, 10);
		
		//Print out the description of each customer object (using the overridden toString() method)
		System.out.println(tristanLee);
		System.out.println(carlosBeltran);
		System.out.println(artiPatel);
		
		tristanLee.setTotalPurchases(8895.00);
		tristanLee.setDiscountRate(12);
		carlosBeltran.setTotalPurchases(100500.00);
		artiPatel.setTotalPurchases(14987.24);
		artiPatel.setLastName("Patel-Ruhil");
		artiPatel.setCashbackRate(13);
		
		//Print out the description of each child class object (using the overridden toString() methods)
		System.out.println(tristanLee);
		System.out.println(carlosBeltran);
		System.out.println(artiPatel);
	}
}
