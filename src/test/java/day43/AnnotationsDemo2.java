package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*1) Login --- @BeforeClass
2) Search --- @Test
3) Adv search   --- @Test
4) Logout  -- -AfterClass
 */

public class AnnotationsDemo2 {

	@BeforeClass
	void login()
	{

		System.out.println("Login to Application........");
	}

	@AfterClass
	void logout()
	{
		System.out.println("Logout from Application.........");

	}

	@Test(priority=1)
	void search()
	{
		System.out.println("Search the application....");

	}

	@Test(priority=2)
	void advanceSearch()
	{
		System.out.println("Advance search..........");

	}





}
