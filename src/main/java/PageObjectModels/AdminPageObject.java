package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPageObject {

	WebDriver driver;

	public AdminPageObject(WebDriver driver) {

		this.driver = driver;
	}

			// Identify Web Element

	private By AdminText = By.xpath("//span[text()='Admin']");
	private By Expected_AdminText = By.xpath("//h6[text()='Admin']");
	private By UserManagement = By.xpath("//span[text()='User Management ']");
	private By User = By.xpath("//a[text()='Users']");

			// Create a method to perform operation

	public WebElement clickOnAdminText() {
		return driver.findElement(AdminText);

	}
	
	public WebElement AdminText() {
		return driver.findElement(Expected_AdminText);
		
	}
	
	public WebElement clickOnUserManagement() {
		return driver.findElement(UserManagement);
		
	}
	
	public WebElement clickOnUser() {
		return driver.findElement(User);
		
	}

}
