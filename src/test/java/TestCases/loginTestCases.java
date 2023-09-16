package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModels.LoginPageObjects;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.Constants;

public class loginTestCases extends BaseClass {

	@Test(priority = 0)
	public void VerifyIsElementDisplayed() throws InterruptedException {

		driver.manage().window().maximize();

		LoginPageObjects lpo = new LoginPageObjects(driver);

		CommonMethod.isElementDisplayed(lpo.IsOrangeHRMLogoDisplayed());
	//	System.out.println(CommonMethod.isElementDisplayed(lpo.IsOrangeHRMLogoDisplayed()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.IsOrangeHRMLogoDisplayed());

		CommonMethod.isElementDisplayed(lpo.IsLoginTextDisplayed());
	//	System.out.println(CommonMethod.isElementDisplayed(lpo.IsLoginTextDisplayed()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.IsLoginTextDisplayed());

		CommonMethod.isElementDisplayed(lpo.isUserNameLabelIconDisplayed());
	//	System.out.println(CommonMethod.isElementDisplayed(lpo.isUserNameLabelIconDisplayed()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.isUserNameLabelIconDisplayed());

		CommonMethod.isElementDisplayed(lpo.isUserNameLabelDisplayed());
	//	System.out.println(CommonMethod.isElementDisplayed(lpo.isUserNameLabelDisplayed()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.isUserNameLabelDisplayed());

		CommonMethod.isElementDisplayed(lpo.isPasswordLabelIconDisplayed());
	//	System.out.println(CommonMethod.isElementDisplayed(lpo.isPasswordLabelIconDisplayed()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.isPasswordLabelIconDisplayed());

		CommonMethod.isElementDisplayed(lpo.isPasswodLabelNamedisplayed());
	//	System.out.println(CommonMethod.isElementDisplayed(lpo.isPasswodLabelNamedisplayed()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(lpo.isPasswodLabelNamedisplayed());

	}

	@Test(priority = 1)
	public void varifyValidLogin() throws IOException, InterruptedException {

		// initializeDriver();
		driver.manage().window().maximize();
		// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		LoginPageObjects lpo = new LoginPageObjects(driver);

		CommonMethod.setText(lpo.EnterUserName(), Constants.ValidUserName);
		CommonMethod.setText(lpo.EnterPassword(), Constants.ValidPassword);
		CommonMethod.clickOnElement(lpo.ClickOnLogin());

		CommonMethod.HandleSoftAssertion(lpo.Actual_Text().getText(), Constants.Expected_PageText);

		/*
		 * SoftAssert softAssert = new SoftAssert();
		 * 
		 * String Expected_PageText = "Dashboard"; String Actual_PageText =
		 * driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		 * 
		 * softAssert.assertEquals(Actual_PageText, Expected_PageText);
		 * softAssert.assertAll();
		 */

		// driver.close();
	}

	@Test(priority = 2)
	public void varifyInvalidLogin() throws InterruptedException {

		LoginPageObjects lpo = new LoginPageObjects(driver);

		CommonMethod.setText(lpo.EnterUserName(), Constants.InvalidUserName);
		CommonMethod.setText(lpo.EnterPassword(), Constants.InvalidPassword);
		CommonMethod.clickOnElement(lpo.ClickOnLogin());

		CommonMethod.HandleSoftAssertion(lpo.Error_Text().getText(), Constants.Expected_ErrorText);

		CommonMethod.setText(lpo.EnterUserName(), Constants.ValidUserName);
		CommonMethod.setText(lpo.EnterPassword(), Constants.InvalidPassword);
		CommonMethod.clickOnElement(lpo.ClickOnLogin());

		CommonMethod.HandleSoftAssertion(lpo.Error_Text().getText(), Constants.Expected_ErrorText);

		CommonMethod.setText(lpo.EnterUserName(), Constants.InvalidUserName);
		CommonMethod.setText(lpo.EnterPassword(), Constants.ValidPassword);
		CommonMethod.clickOnElement(lpo.ClickOnLogin());

		CommonMethod.HandleSoftAssertion(lpo.Error_Text().getText(), Constants.Expected_ErrorText);

		/*
		 * SoftAssert softAssert = new SoftAssert();
		 * 
		 * String Expected_ErrorText = "Invalid credentials"; String Actual_ErrorText =
		 * driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		 * 
		 * softAssert.assertEquals(Actual_ErrorText, Expected_ErrorText);
		 * softAssert.assertAll();
		 */
	}

}
