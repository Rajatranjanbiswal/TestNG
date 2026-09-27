package day47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//creating page object class using pagefactory

public class LoginPage2 {

	WebDriver driver;

	//constructor

	LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);  //mandatory step

	}


	//Locators

	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;


	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;


	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_login;



	//Action methods


	public void userName(String name)
	{
		txt_username.sendKeys(name);
	}


	public void password(String pw)
	{
		txt_password.sendKeys(pw);
	}


	
	public void login()
	{
		
		btn_login.click();
	}
	
	
	
}
