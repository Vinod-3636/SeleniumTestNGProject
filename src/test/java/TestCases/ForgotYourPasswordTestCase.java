package TestCases;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModels.ForgotYourPasswordPageOjects;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.Constants;

public class ForgotYourPasswordTestCase extends BaseClass {

	@Test
	public void verifyResetPasswordPage() throws InterruptedException {

		driver.manage().window().maximize();
		Thread.sleep(2000);

		ForgotYourPasswordPageOjects fyppo = new ForgotYourPasswordPageOjects(driver);

		fyppo.clickOnForgotYourPasswordLink().click();
		Thread.sleep(2000);

		fyppo.isResetPasswordTextDisplayed().isDisplayed();
		CommonMethod.HandleSoftAssertion(fyppo.isResetPasswordTextDisplayed().getText(),Constants.Expected_ResetPasswordText);
		Thread.sleep(2000);

		fyppo.isParagraphTextDisplayed().isDisplayed();
		CommonMethod.HandleSoftAssertion(fyppo.isParagraphTextDisplayed().getText(), Constants.Expected_ParagraphText);
		Thread.sleep(2000);

		fyppo.isUserNameIconDisplayed().isDisplayed();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(fyppo.isUserNameIconDisplayed().isDisplayed());
		softAssert.assertAll();

		fyppo.isUserNameText().isDisplayed();
		CommonMethod.HandleSoftAssertion(fyppo.isUserNameText().getText(), Constants.Expected_UserNameText);
		
		fyppo.enterUserName().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		fyppo.enterUserName().sendKeys(Constants.Expected_ForgotPassword_UserName);
		Thread.sleep(2000);
		
		fyppo.enterUserName().isDisplayed();
		SoftAssert softAssert2 = new SoftAssert();
		softAssert2.assertTrue(fyppo.enterUserName().isDisplayed());
		softAssert2.assertAll();
		
		fyppo.isCancelbuttonDisplayed().isDisplayed();
		SoftAssert softAssert3 = new SoftAssert();
		softAssert3.assertTrue(fyppo.isCancelbuttonDisplayed().isDisplayed());
		softAssert3.assertAll();
		
		fyppo.isResetPasswordButtonDisplayed().isDisplayed();
		SoftAssert softAssert4 = new SoftAssert();
		softAssert4.assertTrue(fyppo.isResetPasswordButtonDisplayed().isDisplayed());
		softAssert4.assertAll();
		
		fyppo.isResetPasswordButtonDisplayed().click();
		Thread.sleep(2000);
		
		CommonMethod.HandleSoftAssertion(fyppo.RestPassword_Successfully_Message().getText(), Constants.Expected_RestPassword_Successfully_Message);

	}

}
