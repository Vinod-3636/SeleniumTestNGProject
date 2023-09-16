package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.CommonMethod;

public class LoginPageObjects extends CommonMethod {

	WebDriver driver;

	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	// Identify Web Element
	
	private By OrangeHRMLogo = By.xpath("//img[@alt='company-branding']");
	private By LoginText = By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']");
	
	private By UserNameLabelIcon = By.xpath("//i[@class='oxd-icon bi-person oxd-input-group__label-icon']");
	private By UserNameLabel = By.xpath("//label[text()='Username']");
	private By UserNameTextBox = By.xpath("//input[@name='username']");
	
	private By PasswordLabelIcon = By.xpath("//i[@class='oxd-icon bi-key oxd-input-group__label-icon']");
	private By PasswodLabelName = By.xpath("//label[text()='Password']"); 
	private By PasswordTextBox = By.xpath("//input[@type='password']");
	
	private By Login = By.xpath("//button[@type='submit']");
	private By Actual_Page_Text = By.xpath("//h6[text()='Dashboard']");
	private By Error_Text_Message = By.xpath("//p[text()='Invalid credentials']");


		//	Create a method to perform operation 
	
	public WebElement IsOrangeHRMLogoDisplayed() {
		waitForElementToVisible(OrangeHRMLogo, driver, 10);
		return driver.findElement(OrangeHRMLogo);
		
	}
	
	public WebElement IsLoginTextDisplayed() {
		waitForElementToVisible(LoginText, driver, 10);
		return driver.findElement(LoginText);
		
	}
	
	public WebElement isUserNameLabelIconDisplayed() {
		waitForElementToVisible(UserNameLabelIcon, driver, 10);
		return driver.findElement(UserNameLabelIcon);
		
	}
	
	public WebElement isUserNameLabelDisplayed() {
		waitForElementToVisible(UserNameLabel, driver, 10);
		return driver.findElement(UserNameLabel);
		
	}
	
	public WebElement EnterUserName() {
		waitForElementToVisible(UserNameTextBox, driver, 10);
		 return driver.findElement(UserNameTextBox);

	}
	

	public WebElement isPasswordLabelIconDisplayed() {
		waitForElementToVisible(PasswordLabelIcon, driver, 10);
		return driver.findElement(PasswordLabelIcon);
		
	}
	
	public WebElement isPasswodLabelNamedisplayed() {
		waitForElementToVisible(PasswodLabelName, driver, 10);
		return driver.findElement(PasswodLabelName);
		
		
	}
	
	public WebElement EnterPassword() {
		waitForElementToVisible(PasswordTextBox, driver, 10);
		return driver.findElement(PasswordTextBox);

	}
	
	public WebElement ClickOnLogin() {
		waitForElementToVisible(Login, driver, 10);
		return driver.findElement(Login);		
		
	}
	
	public WebElement Actual_Text() {
		waitForElementToVisible(Actual_Page_Text, driver, 10);
		return driver.findElement(Actual_Page_Text);
		
		
	}
	
	public WebElement Error_Text() {
		waitForElementToVisible(Error_Text_Message, driver, 10);
		return driver.findElement(Error_Text_Message);
		
	}

}
