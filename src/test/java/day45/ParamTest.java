package day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
	
	WebDriver driver;
	
	
	@BeforeClass
	@Parameters({"browser", "url"})                                       //here browser is the parameter name that we are passing from the xml file (variable)
	void setup(String br, String url) throws InterruptedException            //br is the value that we are passing from the xml file (value)
	{
		
		switch(br.toLowerCase())                                         //here switch case used to lunch the specific browser a/c to value passing from xml
		{
		case "chrome" : driver=new ChromeDriver(); break;     //if br value is chrome, then we are lunching chrome
		case "edge" : driver=new EdgeDriver(); break;
		case "firefox" : driver=new FirefoxDriver(); break;
		default: System.out.println("invalid browser");return;     //return used, if browser is invalid, then it will come out from total method and rest of the things won't execute
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	
	@Test(priority=1)
	void testLogo()
	{
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
		
	}
	
	
	
	@Test(priority=2)
	void testTitle()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
	
	
	
	@Test(priority=3)
	void testURL()
	{
		
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
		
	}
	
	

}
