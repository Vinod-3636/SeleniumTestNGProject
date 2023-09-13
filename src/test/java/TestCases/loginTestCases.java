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
		Thread.sleep(2000);

		LoginPageObjects lpo = new LoginPageObjects(driver);

		boolean HRMLogo = lpo.IsOrangeHRMLogoDisplayed().isDisplayed();
	//	System.out.println(HRMLogo);
		Thread.sleep(2000);
		CommonMethod.HandleVisibiltyOfElement(HRMLogo, true);

		boolean LoginText = lpo.IsOrangeHRMLogoDisplayed().isDisplayed();
	//	System.out.println(LoginText);
		Thread.sleep(2000);
		CommonMethod.HandleVisibiltyOfElement(LoginText, true);
		
		boolean UserNameIcon = lpo.isUserNameLabelIconDisplayed().isDisplayed();
		Thread.sleep(2000);
		CommonMethod.HandleVisibiltyOfElement(UserNameIcon, true);
		
		boolean UserNameLabel = lpo.isUserNameLabelDisplayed().isDisplayed();
		Thread.sleep(2000);
		CommonMethod.HandleVisibiltyOfElement(UserNameLabel, true);
		
		boolean PasswordLabelIcon = lpo.isPasswordLabelIconDisplayed().isDisplayed();
		Thread.sleep(2000);
		CommonMethod.HandleVisibiltyOfElement(PasswordLabelIcon, true);
		
		


		
	}




	
	@Test(priority = 4)
	public void verifyIsPasswordLabelIconDisplayed() throws InterruptedException {
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		LoginPageObjects lpo = new LoginPageObjects(driver);

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(lpo.isPasswordLabelIconDisplayed().isDisplayed());
		softAssert.assertAll();
	}
	
	@Test(priority = 5)
	public void verifyIsPasswodLabelNamedisplayed() throws InterruptedException {
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		LoginPageObjects lpo = new LoginPageObjects(driver);
		
		CommonMethod.HandleSoftAssertion(lpo.isPasswodLabelNamedisplayed().getText(), Constants.Expected_PasswodLabelName);
		
	}

	@Test(priority = 6)
	public void varifyValidLogin() throws IOException, InterruptedException {

		// initializeDriver();
		driver.manage().window().maximize();
		// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		LoginPageObjects lpo = new LoginPageObjects(driver);

		lpo.EnterUserName().sendKeys(Constants.ValidUserName);
		lpo.EnterPassword().sendKeys(Constants.ValidPassword);
		lpo.ClickOnLogin().click();
		Thread.sleep(5000);

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

	@Test(priority = 7)
	public void varifyInvalidLogin() throws InterruptedException {

		Thread.sleep(2000);

		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.EnterUserName().sendKeys(Constants.InvalidUserName);
		lpo.EnterPassword().sendKeys(Constants.InvalidPassword);
		lpo.ClickOnLogin().click();
		Thread.sleep(5000);

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
