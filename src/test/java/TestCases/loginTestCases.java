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
	public void varifyValidLogin() throws IOException, InterruptedException {
		
	//	initializeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.EnterUserName().sendKeys(Constants.ValidUserName);
		lpo.EnterPassword().sendKeys(Constants.ValidPassword);
		lpo.ClickOnLogin().click();
		Thread.sleep(5000);
		
		CommonMethod.HandleSoftAssertion(lpo.Actual_Text().getText(), Constants.Expected_PageText);
		
	/*	SoftAssert softAssert = new SoftAssert();
		
		String Expected_PageText = "Dashboard";
		String Actual_PageText = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		
		softAssert.assertEquals(Actual_PageText, Expected_PageText);
		softAssert.assertAll();		*/
		
			
	//	driver.close();
	}
	
	@Test(priority = 1)
	public void varifyInvalidLogin() throws InterruptedException {
		
		  Thread.sleep(2000);
		  
		  LoginPageObjects  lpo=new LoginPageObjects(driver);
		  lpo.EnterUserName().sendKeys(Constants.InvalidUserName);
		  lpo.EnterPassword().sendKeys(Constants.InvalidPassword);
		  lpo.ClickOnLogin().click();
		  Thread.sleep(5000);
		  
		  CommonMethod.HandleSoftAssertion(lpo.Error_Text().getText(), Constants.Expected_ErrorText);
		  
	/*	  SoftAssert softAssert = new SoftAssert();
		  
		  String Expected_ErrorText = "Invalid credentials";
		  String Actual_ErrorText = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		  
		  softAssert.assertEquals(Actual_ErrorText, Expected_ErrorText);
		  softAssert.assertAll();		*/
	}

}
