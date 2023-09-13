package TestCases;

import org.testng.annotations.Test;

import PageObjectModels.AdminPageObject;
import PageObjectModels.LoginPageObjects;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.Constants;

public class AdminPageTestCase extends BaseClass {

	@Test
	public void verifyAdminPage() throws InterruptedException {

		driver.manage().window().maximize();
		Thread.sleep(2000);

		LoginPageObjects lpo = new LoginPageObjects(driver);

		lpo.EnterUserName().sendKeys(Constants.ValidUserName);
		lpo.EnterPassword().sendKeys(Constants.ValidPassword);
		lpo.ClickOnLogin().click();
		Thread.sleep(2000);

		AdminPageObject apo = new AdminPageObject(driver);

		apo.clickOnAdminText().click();
		Thread.sleep(2000);

		CommonMethod.HandleSoftAssertion(apo.AdminText().getText(), Constants.Expected_AdminText);

		apo.clickOnUserManagement().click();
		Thread.sleep(2000);

		CommonMethod.HandleSoftAssertion(apo.clickOnUser().getText(), Constants.Expected_User);

		apo.clickOnUser().click();
		Thread.sleep(2000);

	}

}
