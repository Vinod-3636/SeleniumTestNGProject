package TestCases;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModels.ForgotYourPasswordPageOjects;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.Constants;

public class ForgotYourPasswordTestCase extends BaseClass {

	@Test(priority = 0)
	public void verifyVisibilityOfwebElement() throws InterruptedException {

		driver.manage().window().maximize();
		Thread.sleep(2000);

		ForgotYourPasswordPageOjects fyppo = new ForgotYourPasswordPageOjects(driver);

		fyppo.clickOnForgotYourPasswordLink().click();
		Thread.sleep(2000);

		boolean ResetPasswordTextDisplayed = fyppo.isResetPasswordTextDisplayed().isDisplayed();
		Thread.sleep(2000);
		CommonMethod.HandleVisibiltyOfElement(ResetPasswordTextDisplayed, true);

		boolean ParagraphTextDisplayed = fyppo.isParagraphTextDisplayed().isDisplayed();
		Thread.sleep(2000);
		CommonMethod.HandleVisibiltyOfElement(ParagraphTextDisplayed, true);

		boolean UserNameIconDisplayed = fyppo.isUserNameIconDisplayed().isDisplayed();
		Thread.sleep(2000);
		CommonMethod.HandleVisibiltyOfElement(UserNameIconDisplayed, true);

		boolean UserNameTextDisplayed = fyppo.isUserNameText().isDisplayed();
		Thread.sleep(2000);
		CommonMethod.HandleVisibiltyOfElement(UserNameTextDisplayed, true);

		boolean CancelbuttonDisplayed = fyppo.CancelButton().isDisplayed();
		Thread.sleep(2000);
		CommonMethod.HandleVisibiltyOfElement(CancelbuttonDisplayed, true);

		boolean ResetPasswordButtonDisplayed = fyppo.ResetPasswordButton().isDisplayed();
		Thread.sleep(2000);
		CommonMethod.HandleVisibiltyOfElement(ResetPasswordButtonDisplayed, true);

	}

	@Test(priority = 1)
	public void verifyCancelButton() throws InterruptedException {

		driver.manage().window().maximize();
		Thread.sleep(2000);

		ForgotYourPasswordPageOjects fyppo = new ForgotYourPasswordPageOjects(driver);

		fyppo.clickOnForgotYourPasswordLink().click();
		Thread.sleep(2000);

		fyppo.CancelButton().click();
		Thread.sleep(5000);

		CommonMethod.HandleSoftAssertion(fyppo.IsLoginTextDisplayed().getText(), Constants.Expected_LoginText);

	}

	@Test(priority = 2)
	public void verifyResetPasswordButton() throws InterruptedException {

		driver.manage().window().maximize();
		Thread.sleep(2000);

		ForgotYourPasswordPageOjects fyppo = new ForgotYourPasswordPageOjects(driver);

		fyppo.clickOnForgotYourPasswordLink().click();
		Thread.sleep(2000);

		fyppo.ResetPasswordButton().click();
		Thread.sleep(5000);

		CommonMethod.HandleSoftAssertion(fyppo.ResetButtonErrorText().getText(),
				Constants.Expected_ResetButtonErrorText);

		fyppo.enterUserName().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		fyppo.enterUserName().sendKeys(Constants.Expected_ForgotPassword_UserName);
		Thread.sleep(2000);

		fyppo.ResetPasswordButton().click();
		Thread.sleep(2000);

		CommonMethod.HandleSoftAssertion(fyppo.RestPassword_Successfully_Message().getText(),
				Constants.Expected_RestPassword_Successfully_Message);

	}

}
