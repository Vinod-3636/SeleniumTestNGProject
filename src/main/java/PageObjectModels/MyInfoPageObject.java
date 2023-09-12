package PageObjectModels;

import java.security.PublicKey;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyInfoPageObject {

	public WebDriver driver;

	public MyInfoPageObject(WebDriver driver) {

		this.driver = driver;

	}

	// Identify Web Element

	private By MyInfo = By.xpath("//span[text()='My Info']");
	private By Frist_Name = By.xpath("(//div[@data-v-957b4417]/input)[1]");
	private By Middle_Name = By.xpath("(//div[@data-v-957b4417]/input)[2]");
	private By Last_Name = By.xpath("(//div[@data-v-957b4417]/input)[3]");
	private By NickName = By.xpath("(//div[@data-v-957b4417]/input)[4]");
	
	private By EmployeeID = By.xpath("(//div[@data-v-957b4417]/input)[5]");                 
	private By OtherID = By.xpath("(//div[@data-v-957b4417]/input)[6]");
	private By DriverLicenseNumber = By.xpath("(//div[@data-v-957b4417]/input)[7]");
	private By LicenseExpiryDate = By.xpath("(//input[@placeholder='yyyy-mm-dd'])[1]");  
	private By SSNNumber = By.xpath("(//div[@data-v-957b4417]/input)[8]");
	private By SINNumber = By.xpath("(//div[@data-v-957b4417]/input)[9]");
	
//	private By Scroll_Nationality = By.xpath("(//label[@class='oxd-label'])[8]");
	
	private By nationalityDropdown = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
	private By nationalityOptions = By.xpath("//div[@class='oxd-select-option']");
	private By Material_Status = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");
	private By Material_Status_Dropdown = By.xpath("//div[@class='oxd-select-option']");
	private By DateOfBirth = By.xpath("(//input[@placeholder='yyyy-mm-dd'])[2]");
	private By Gender_Type = By.xpath("(//div[@class='oxd-radio-wrapper'])[2]");
	
	private By Military_Service = By.xpath("(//div[@data-v-957b4417]/input)[10]");
	private By Smoker = By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]");
	
	private By Blood_Type = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]");
	private By Blood_Type_Dropdown = By.xpath("//div[@class='oxd-select-option']");
	
	private By Attachment_AddButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--text']");
	private By SelectFile_Browse = By.xpath("//div[@class='oxd-file-button']");
	private By Comment = By.xpath("//textarea[@placeholder='Type comment here']");
	

	// Create a method to perform operation

	public WebElement ClickOnMyInfo() {
		return driver.findElement(MyInfo);

	}

	public WebElement EnterFirstName() {
		return driver.findElement(Frist_Name);

	}

	public WebElement EnterMiddleName() {
		return driver.findElement(Middle_Name);

	}

	public WebElement EnterLastName() {
		return driver.findElement(Last_Name);

	}

	public WebElement EnterNickName() {
		return driver.findElement(NickName);

	}

	public WebElement EnterEmployeeID() {
		return driver.findElement(EmployeeID);

	}

	public WebElement EnterOtherID() {
		return driver.findElement(OtherID);

	}

	public WebElement EnterDriverLicenseNumber() {
		return driver.findElement(DriverLicenseNumber);

	}

	public WebElement ClickOnLicenseExpiryDate() {
		return driver.findElement(LicenseExpiryDate);

	}

	public WebElement EnterSSNNumber() {
		return driver.findElement(SSNNumber);

	}

	public WebElement EnterSINNumber() {
		return driver.findElement(SINNumber);

	}
	
	public WebElement clickOnNationalityDropdwon() {

		return driver.findElement(nationalityDropdown);
	}

	public List<WebElement> chooseNationality() {

		return driver.findElements(nationalityOptions);
	}
	
	public WebElement clickOnMaterial_Status() {
		return driver.findElement(Material_Status);
		
		
	}
	
	public List<WebElement> chooseMaterial_Status_Dropdown(){
		return driver.findElements(Material_Status_Dropdown);
		
	}
	
	public WebElement clickOnDateOfBirth() {
		return driver.findElement(DateOfBirth);
		
	}
	
	public WebElement selectGender(){
		return driver.findElement(Gender_Type);
		
	}
	

	public WebElement EnterMilitary_Service() {
		return driver.findElement(Military_Service);
		
	}
	
	
	public WebElement clickOnSmoker() {
		return driver.findElement(Smoker);
		
	}
	
	public WebElement clickOnBlood_Type() {
		return driver.findElement(Blood_Type);
		
	}
	
	public List<WebElement> choose_Blood_Type(){
		return driver.findElements(Blood_Type_Dropdown);
		
	}
	
	public WebElement clickOnAttachment_AddButton() {
		return driver.findElement(Attachment_AddButton);
		
	}
	
	public WebElement selectSelectFile_Browse() {
		return driver.findElement(SelectFile_Browse);		
	}
	
	public WebElement EnterComment() {
		return driver.findElement(Comment);
		
	}


}
