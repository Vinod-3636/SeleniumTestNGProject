package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	WebDriver driver;

	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	// Identify Web Element

	private By UserName = By.xpath("//input[@name='username']");
	private By Password = By.xpath("//input[@type='password']");
	private By Login = By.xpath("//button[@type='submit']");
	private By Actual_Page_Text = By.xpath("//h6[text()='Dashboard']");
	private By Error_Text_Message = By.xpath("//p[text()='Invalid credentials']");


		//	Create a method to perform operation 
	
	public WebElement EnterUserName() {
		return driver.findElement(UserName);

	}

	public WebElement EnterPassword() {
		return driver.findElement(Password);

	}
	
	public WebElement ClickOnLogin() {
		return driver.findElement(Login);		
		
	}
	
	public WebElement Actual_Text() {
		return driver.findElement(Actual_Page_Text);
		
		
	}
	
	public WebElement Error_Text() {
		return driver.findElement(Error_Text_Message);
		
	}

}
