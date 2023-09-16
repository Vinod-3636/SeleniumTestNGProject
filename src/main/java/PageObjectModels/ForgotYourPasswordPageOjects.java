package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.CommonMethod;

public class ForgotYourPasswordPageOjects extends CommonMethod {

	WebDriver driver;

	public ForgotYourPasswordPageOjects(WebDriver driver) {

		this.driver = driver;

	}

	// Identify Web Element

	private By ForgotYourPasswordLink = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
	private By ResetPasswordText = By.xpath("//h6[text()='Reset Password']");
	private By ParagraphText = By
			.xpath("//p[text()='Please enter your username to identify your account to reset your password']");
	private By UserNameIcon = By.xpath("//i[@class='oxd-icon bi-person oxd-input-group__label-icon']");
	private By UserNameText = By.xpath("//label[@class='oxd-label']");
	private By UserNameTextField = By.xpath("//div[@data-v-957b4417]/input");
	private By CancelButton = By.xpath("//button[@type='button']");
	private By LoginText = By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']");
	private By ResetPasswordButton = By.xpath("//button[@type='submit']");
	private By ResetButtonErrorText = By.xpath("//span[text()='Required']");
	private By ResetPasswordLinkSentSuccessfully_Message = By
			.xpath("//h6[text()='Reset Password link sent successfully']");

	// Create a method to perform operation

	public WebElement clickOnForgotYourPasswordLink() {
		waitForElementToVisible(ForgotYourPasswordLink, driver, 30);
		return driver.findElement(ForgotYourPasswordLink);

	}

	public WebElement isResetPasswordTextDisplayed() {
		waitForElementToVisible(ResetPasswordText, driver, 30);
		return driver.findElement(ResetPasswordText);

	}

	public WebElement isParagraphTextDisplayed() {
		waitForElementToVisible(ParagraphText, driver, 30);
		return driver.findElement(ParagraphText);

	}

	public WebElement isUserNameIconDisplayed() {
		waitForElementToVisible(UserNameIcon, driver, 30);
		return driver.findElement(UserNameIcon);

	}

	public WebElement isUserNameText() {
		waitForElementToVisible(UserNameText, driver, 30);
		return driver.findElement(UserNameText);

	}

	public WebElement enterUserName() {
		waitForElementToVisible(UserNameTextField, driver, 30);
		return driver.findElement(UserNameTextField);

	}

	public WebElement CancelButton() {
		waitForElementToVisible(CancelButton, driver, 30);
		return driver.findElement(CancelButton);

	}

	public WebElement IsLoginTextDisplayed() {
		waitForElementToVisible(LoginText, driver, 30);
		return driver.findElement(LoginText);

	}

	public WebElement ResetPasswordButton() {
		waitForElementToVisible(ResetPasswordButton, driver, 30);
		return driver.findElement(ResetPasswordButton);

	}

	public WebElement ResetButtonErrorText() {
		waitForElementToVisible(ResetButtonErrorText, driver, 30);
		return driver.findElement(ResetButtonErrorText);

	}

	public WebElement RestPassword_Successfully_Message() {
		waitForElementToVisible(ResetPasswordLinkSentSuccessfully_Message, driver, 30);
		return driver.findElement(ResetPasswordLinkSentSuccessfully_Message);

	}

}
