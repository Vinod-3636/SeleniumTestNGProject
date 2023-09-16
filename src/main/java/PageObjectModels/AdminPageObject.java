package PageObjectModels;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.CommonMethod;

public class AdminPageObject extends CommonMethod {

	WebDriver driver;

	public AdminPageObject(WebDriver driver) {

		this.driver = driver;
	}

	// Identify Web Element

	private By AdminText = By.xpath("//span[text()='Admin']");
	private By ActualText_UserManagement = By.xpath("//h6[text()='User Management']");
	private By UserManagement = By.xpath("//span[text()='User Management ']");
	private By User = By.xpath("//a[text()='Users']");

	private By SystemUsers = By.xpath("//h5[text()='System Users']");
	private By UserName = By.xpath("//label[text()='Username']");
	private By UserName_TextField = By.xpath("//div[@data-v-957b4417]/input");
	private By UserRole = By.xpath("//label[text()='User Role']");
	private By UserRole_ArrowKey = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
	private By UserRole_Dropdown = By.xpath("//div[@class='oxd-select-option']");
	private By EmployeeName = By.xpath("//label[text()='Employee Name']");
	private By EmployeeName_TextField = By.xpath("//input[@placeholder='Type for hints...']");
	private By Status = By.xpath("//label[text()='Status']");
	private By Status_ArrowKey = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");
	private By Status_Dropdown = By.xpath("//div[@class='oxd-select-option']");
	private By SubmitButton = By.xpath("//button[@type='submit']");
	private By RecordFound_LabelName = By.xpath("//span[text()='(1) Record Found']");

	// Create a method to perform operation

	public WebElement AdminText() {
		waitForElementToVisible(AdminText, driver, 30);
		return driver.findElement(AdminText);

	}

	public WebElement ActualText_UserManagement() {
		waitForElementToVisible(ActualText_UserManagement, driver, 30);
		return driver.findElement(ActualText_UserManagement);

	}

	public WebElement UserManagement() {
		waitForElementToVisible(UserManagement, driver, 30);
		return driver.findElement(UserManagement);

	}

	public WebElement User() {
		waitForElementToVisible(User, driver, 30);
		return driver.findElement(User);

	}

	public WebElement SystemUsers() {
		waitForElementToVisible(SystemUsers, driver, 30);
		return driver.findElement(SystemUsers);

	}

	public WebElement UserName() {
		waitForElementToVisible(UserName, driver, 30);
		return driver.findElement(UserName);
	}

	public WebElement UserName_TextField() {
		waitForElementToVisible(UserName_TextField, driver, 30);
		return driver.findElement(UserName_TextField);

	}

	public WebElement UserRole() {
		waitForElementToVisible(UserRole, driver, 30);
		return driver.findElement(UserRole);
	}

	public WebElement UserRole_ArrowKey() {
		waitForElementToVisible(UserRole_ArrowKey, driver, 30);
		return driver.findElement(UserRole_ArrowKey);

	}

	public List<WebElement> UserRole_Dropdown() {
		waitForElementToVisible(UserRole_Dropdown, driver, 0);
		return driver.findElements(UserRole_Dropdown);

	}

	public WebElement EmployeeName() {
		waitForElementToVisible(EmployeeName, driver, 30);
		return driver.findElement(EmployeeName);

	}

	public WebElement EmployeeName_TextField() {
		waitForElementToVisible(EmployeeName_TextField, driver, 30);
		return driver.findElement(EmployeeName_TextField);

	}

	public WebElement Status() {
		waitForElementToVisible(Status, driver, 30);
		return driver.findElement(Status);

	}

	public WebElement Status_ArrowKey() {
		waitForElementToVisible(Status_ArrowKey, driver, 30);
		return driver.findElement(Status_ArrowKey);

	}

	public List<WebElement> Status_Dropdown() {
		waitForElementToVisible(Status_Dropdown, driver, 30);
		return driver.findElements(Status_Dropdown);

	}
	
	public WebElement SubmitButton() {
		waitForElementToVisible(SubmitButton, driver, 30);
		return driver.findElement(SubmitButton);
		
		
	}
	
	public WebElement RecordFound_LabelName() {
		waitForElementToVisible(RecordFound_LabelName, driver, 30);
		return driver.findElement(RecordFound_LabelName);
		
	}

}
