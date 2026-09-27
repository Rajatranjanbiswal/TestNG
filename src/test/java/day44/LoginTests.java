package day44;

import org.testng.annotations.Test;

public class LoginTests {
	
	
	@Test(priority=1, groups= {"sanity"})
	void loginByfacebook()
	{
		System.out.println("This is login by facebook.....");
		
	}
	
	
	@Test(priority=2, groups= {"sanity"})
	void loginByemail()
	{
		System.out.println("This is login by email..");
	}
	
	@Test(priority=3, groups= {"sanity"})
	void loginBytwitter()
	{
		
		System.out.println("This is login by twitter......");
	}

}
