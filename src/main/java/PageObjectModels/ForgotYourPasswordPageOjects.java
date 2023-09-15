package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotYourPasswordPageOjects {

	WebDriver driver;

	public ForgotYourPasswordPageOjects(WebDriver driver) {

		this.driver = driver;

	}

	// Identify Web Element

	private By ForgotYourPasswordLink = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
	private By ResetPasswordText = By.xpath("//h6[text()='Reset Password']");
	private By ParagraphText = By.xpath("//p[text()='Please enter your username to identify your account to reset your password']");
	private By UserNameIcon = By.xpath("//i[@class='oxd-icon bi-person oxd-input-group__label-icon']");
	private By UserNameText = By.xpath("//label[@class='oxd-label']");
	private By UserNameTextField = By.xpath("//div[@data-v-957b4417]/input");
	private By CancelButton = By.xpath("//button[@type='button']");
	private By LoginText = By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']");
	private By ResetPasswordButton = By.xpath("//button[@type='submit']");
	private By ResetButtonErrorText = By.xpath("//span[text()='Required']");
	private By ResetPasswordLinkSentSuccessfully_Message = By.xpath("//h6[text()='Reset Password link sent successfully']");

	// Create a method to perform operation

	public WebElement clickOnForgotYourPasswordLink() {
		return driver.findElement(ForgotYourPasswordLink);

	}

	public WebElement isResetPasswordTextDisplayed() {
		return driver.findElement(ResetPasswordText);

	}

	public WebElement isParagraphTextDisplayed() {
		return driver.findElement(ParagraphText);

	}

	public WebElement isUserNameIconDisplayed() {
		return driver.findElement(UserNameIcon);

	}

	public WebElement isUserNameText() {
		return driver.findElement(UserNameText);

	}

	public WebElement enterUserName() {
		return driver.findElement(UserNameTextField);

	}

	public WebElement CancelButton() {
		return driver.findElement(CancelButton);

	}
	
	public WebElement IsLoginTextDisplayed() {
		return driver.findElement(LoginText);
		
	}

	public WebElement ResetPasswordButton() {
		return driver.findElement(ResetPasswordButton);

	}
	
	public WebElement ResetButtonErrorText() {
		return driver.findElement(ResetButtonErrorText);
		
	}
	
	public WebElement RestPassword_Successfully_Message() {
		return driver.findElement(ResetPasswordLinkSentSuccessfully_Message);
		
	}

}
