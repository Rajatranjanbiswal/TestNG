package day47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	
	@BeforeClass
	void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	void loginTest()
	{
		//LoginPage lp=new LoginPage(driver);     //creating object for LoginPage
		LoginPage2 lp=new LoginPage2(driver);     //creating object for LoginPage2
		lp.userName("Admin");
		lp.password("admin123");
		lp.login();
		
		
		
		
	}
	
	
	@AfterClass
	void tearDown()
	{
		
		driver.quit();
		
	}

}
