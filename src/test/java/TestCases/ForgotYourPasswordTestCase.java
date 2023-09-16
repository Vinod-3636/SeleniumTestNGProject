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

		ForgotYourPasswordPageOjects fyppo = new ForgotYourPasswordPageOjects(driver);

		CommonMethod.clickOnElement(fyppo.clickOnForgotYourPasswordLink());

		CommonMethod.isElementDisplayed(fyppo.isResetPasswordTextDisplayed());
		System.out.println(CommonMethod.isElementDisplayed(fyppo.isResetPasswordTextDisplayed()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(fyppo.isResetPasswordTextDisplayed());

		CommonMethod.isElementDisplayed(fyppo.isParagraphTextDisplayed());
		System.out.println(CommonMethod.isElementDisplayed(fyppo.isParagraphTextDisplayed()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(fyppo.isParagraphTextDisplayed());

		CommonMethod.isElementDisplayed(fyppo.isUserNameIconDisplayed());
		System.out.println(CommonMethod.isElementDisplayed(fyppo.isUserNameIconDisplayed()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(fyppo.isUserNameIconDisplayed());

		CommonMethod.isElementDisplayed(fyppo.isUserNameText());
		System.out.println(CommonMethod.isElementDisplayed(fyppo.isUserNameText()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(fyppo.isUserNameText());

		CommonMethod.isElementDisplayed(fyppo.CancelButton());
		System.out.println(CommonMethod.isElementDisplayed(fyppo.CancelButton()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(fyppo.CancelButton());

		CommonMethod.isElementDisplayed(fyppo.ResetPasswordButton());
		System.out.println(CommonMethod.isElementDisplayed(fyppo.ResetPasswordButton()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(fyppo.ResetPasswordButton());

	}

	@Test(priority = 1)
	public void verifyCancelButton() throws InterruptedException {

		driver.manage().window().maximize();

		ForgotYourPasswordPageOjects fyppo = new ForgotYourPasswordPageOjects(driver);

		CommonMethod.isElementDisplayed(fyppo.clickOnForgotYourPasswordLink());
		System.out.println(CommonMethod.isElementDisplayed(fyppo.clickOnForgotYourPasswordLink()));
		CommonMethod.clickOnElement(fyppo.clickOnForgotYourPasswordLink());

		CommonMethod.clickOnElement(fyppo.CancelButton());

		CommonMethod.HandleSoftAssertion(fyppo.IsLoginTextDisplayed().getText(), Constants.Expected_LoginText);

	}

	@Test(priority = 2)
	public void verifyResetPasswordButton() throws InterruptedException {

		driver.manage().window().maximize();

		ForgotYourPasswordPageOjects fyppo = new ForgotYourPasswordPageOjects(driver);

		CommonMethod.clickOnElement(fyppo.clickOnForgotYourPasswordLink());

		CommonMethod.clickOnElement(fyppo.ResetPasswordButton());

		CommonMethod.HandleSoftAssertion(fyppo.ResetButtonErrorText().getText(),Constants.Expected_ResetButtonErrorText);

		fyppo.enterUserName().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		CommonMethod.setText(fyppo.enterUserName(), Constants.Expected_ForgotPassword_UserName);

		CommonMethod.clickOnElement(fyppo.ResetPasswordButton());

		CommonMethod.HandleSoftAssertion(fyppo.RestPassword_Successfully_Message().getText(),Constants.Expected_RestPassword_Successfully_Message);

	}

}
