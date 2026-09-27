package day44;

import org.testng.annotations.Test;

public class PaymentTests {
	
	@Test(priority=1, groups= {"sanity", "regression", "functional"})
	void paymentinrupees()
	{
		
		System.out.println("This is payment in rupees");
	}
	
	@Test(priority=2, groups= {"sanity", "regression", "functional"})
	void paymentindollar()
	{
		
		System.out.println("This is payment in dollar");
	}

}
