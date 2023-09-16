package TestCases;

import org.testng.annotations.Test;

import PageObjectModels.AdminPageObject;
import PageObjectModels.LoginPageObjects;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.Constants;

public class AdminPageTestCase extends BaseClass {

	@Test
	public void verifyVisibilityOfWebElement() {

		driver.manage().window().maximize();

		LoginPageObjects lpo = new LoginPageObjects(driver);

		CommonMethod.setText(lpo.EnterUserName(), Constants.ValidUserName);
		CommonMethod.setText(lpo.EnterPassword(), Constants.ValidPassword);
		CommonMethod.clickOnElement(lpo.ClickOnLogin());

		CommonMethod.HandleSoftAssertion(lpo.Actual_Text().getText(), Constants.Expected_DashboardText);

		AdminPageObject apo = new AdminPageObject(driver);

		CommonMethod.isElementDisplayed(apo.AdminText());
		System.out.println(CommonMethod.isElementDisplayed(apo.AdminText()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(apo.AdminText());
		


	}

	@Test
	public void verifyAdminPage() throws InterruptedException {

		driver.manage().window().maximize();

		LoginPageObjects lpo = new LoginPageObjects(driver);

		CommonMethod.setText(lpo.EnterUserName(), Constants.ValidUserName);
		CommonMethod.setText(lpo.EnterPassword(), Constants.ValidPassword);
		CommonMethod.clickOnElement(lpo.ClickOnLogin());

		CommonMethod.HandleSoftAssertion(lpo.Actual_Text().getText(), Constants.Expected_DashboardText);

		AdminPageObject apo = new AdminPageObject(driver);

		CommonMethod.clickOnElement(apo.AdminText());
		CommonMethod.HandleSoftAssertion(apo.ActualText_UserManagement().getText(), Constants.Expected_UserManagement);

		CommonMethod.clickOnElement(apo.UserManagement());
		CommonMethod.HandleSoftAssertion(apo.User().getText(), Constants.Expected_UserText);
		
		CommonMethod.clickOnElement(apo.User());
		
		CommonMethod.isElementDisplayed(apo.SystemUsers());
		System.out.println(CommonMethod.isElementDisplayed(apo.SystemUsers()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(apo.SystemUsers());
		
		CommonMethod.isElementDisplayed(apo.UserName());
		System.out.println(CommonMethod.isElementDisplayed(apo.UserName()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(apo.UserName());
		
		CommonMethod.setText(apo.UserName_TextField(), Constants.UserName_TextField);
		
		CommonMethod.isElementDisplayed(apo.UserRole());
		System.out.println(CommonMethod.isElementDisplayed(apo.UserRole()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(apo.UserRole());
		
		CommonMethod.clickOnElement(apo.UserRole_ArrowKey());
		CommonMethod.HandleDropDown(apo.UserRole_Dropdown(), Constants.Choose_UserRole);
		
		CommonMethod.isElementDisplayed(apo.EmployeeName());
		System.out.println(CommonMethod.isElementDisplayed(apo.EmployeeName()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(apo.EmployeeName());
		
		CommonMethod.setText(apo.EmployeeName_TextField(), Constants.EmployeeName_TextField);
		
		CommonMethod.isElementDisplayed(apo.Status());
		System.out.println(CommonMethod.isElementDisplayed(apo.Status()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(apo.Status());
		
		CommonMethod.clickOnElement(apo.Status_ArrowKey());
		
		CommonMethod.HandleDropDown(apo.Status_Dropdown(),Constants.Choose_Status_Dropdown );
		
		CommonMethod.clickOnElement(apo.SubmitButton());
		CommonMethod.isElementDisplayed(apo.RecordFound_LabelName());
		System.out.println(CommonMethod.isElementDisplayed(apo.RecordFound_LabelName()));
		CommonMethod.HandleAssertionForVisibiltyOfElement(apo.RecordFound_LabelName());
		
		
		
	}

}
