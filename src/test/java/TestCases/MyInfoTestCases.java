package TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import PageObjectModels.LoginPageObjects;
import PageObjectModels.MyInfoPageObject;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.Constants;

public class MyInfoTestCases extends BaseClass {

	@Test
	public void verifyFillPersonalDetails() throws IOException, InterruptedException, AWTException {

	//	initializeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.EnterUserName().sendKeys(Constants.ValidUserName);
		lpo.EnterPassword().sendKeys(Constants.ValidPassword);
		lpo.ClickOnLogin().click();
		Thread.sleep(5000);

		MyInfoPageObject mipo = new MyInfoPageObject(driver);
		mipo.ClickOnMyInfo().click();
		Thread.sleep(5000);

		mipo.EnterFirstName().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(3000);
		mipo.EnterFirstName().sendKeys(Constants.EnterFirstName);
		Thread.sleep(1000);
		
		mipo.EnterMiddleName().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(3000);
		mipo.EnterMiddleName().sendKeys(Constants.EnterMiddleName);
		Thread.sleep(1000);

		mipo.EnterLastName().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(3000);
		mipo.EnterLastName().sendKeys(Constants.EnterLastName);
		Thread.sleep(1000);

		mipo.EnterNickName().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(3000);
		mipo.EnterNickName().sendKeys(Constants.EnterNickName);
		Thread.sleep(2000);

		mipo.EnterEmployeeID().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(3000);
		mipo.EnterEmployeeID().sendKeys(Constants.EnterEmployeeID);
		Thread.sleep(2000);

		mipo.EnterOtherID().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(3000);
		mipo.EnterOtherID().sendKeys(Constants.EnterOtherID);
		Thread.sleep(2000);

		mipo.EnterDriverLicenseNumber().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(3000);
		mipo.EnterDriverLicenseNumber().sendKeys(Constants.EnterDriverLicenseNumber);
		Thread.sleep(2000);

		mipo.ClickOnLicenseExpiryDate().click();
		Thread.sleep(2000);
			

		mipo.EnterSSNNumber().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mipo.EnterSSNNumber().sendKeys(Constants.EnterSSNNumber);
		Thread.sleep(2000);

		mipo.EnterSINNumber().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mipo.EnterSINNumber().sendKeys(Constants.EnterSINNumber);
		Thread.sleep(2000);

		
	/*	  WebElement Nationality_Scroll = mipo.Scroll_Till_Nationality();
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].scrollIntoView();", Nationality_Scroll);
		  Thread.sleep(3000);			*/
		 

		mipo.clickOnNationalityDropdwon().click();
		Thread.sleep(3000);
		
		CommonMethod.HandleDropDown(mipo.chooseNationality(), Constants.chooseNationality);

	/*	List<WebElement> obj = mipo.chooseNationality();

		for (WebElement k : obj) {
			if (k.getText().equalsIgnoreCase("Indian")) {
				k.click();
				Thread.sleep(2000);
				break;

			}
		}		*/
	
		mipo.clickOnMaterial_Status().click();
		Thread.sleep(2000);
		
		CommonMethod.HandleDropDown(mipo.chooseMaterial_Status_Dropdown(), Constants.chooseMaterial_Status_Dropdown);

	/*	List<WebElement> All_Material_List = mipo.chooseMaterial_Status_Dropdown();
		for (WebElement Material : All_Material_List) {

			if (Material.getText().equalsIgnoreCase("Single")) {
				Material.click();
				Thread.sleep(2000);
				break;
			}
		}			*/
		
		mipo.clickOnDateOfBirth().click();
		Thread.sleep(2000);

		mipo.selectGender().click();
		Thread.sleep(2000);

		mipo.EnterMilitary_Service().sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		Thread.sleep(2000);
		mipo.EnterMilitary_Service().sendKeys(Constants.EnterMilitary_Service);
		Thread.sleep(2000);

	 
		mipo.clickOnSmoker().click();
		Thread.sleep(3000);

		mipo.clickOnBlood_Type().click();
		Thread.sleep(2000);
		
		CommonMethod.HandleDropDown(mipo.choose_Blood_Type(), Constants.choose_Blood_Type);

	/*	List<WebElement> All_Blood_Type_List = mipo.choose_Blood_Type();
		for (WebElement Blood_Type : All_Blood_Type_List) {

			if (Blood_Type.getText().equalsIgnoreCase("O+")) {
				Blood_Type.click();
				Thread.sleep(3000);
				break;

			}

		}			*/

		mipo.clickOnAttachment_AddButton().click();
		Thread.sleep(3000);

		// If we have attribute name as a "Type = File" then we used SendKeys() method.

		/*
		 * mipo.selectSelectFile_Browse().
		 * sendKeys("C:\\Users\\Admin\\Downloads\\Sample PDF file.pdf");
		 * Thread.sleep(2000);
		 */

		// If we don't have attribute name as a "Type = File" then we used Robot Class.

		mipo.selectSelectFile_Browse().click();
		Thread.sleep(2000);

		Robot robot = new Robot();
		Thread.sleep(2000);

		// To perform CTRL + C action to copy file.

		StringSelection stringSelection = new StringSelection("C:\\Users\\Admin\\Downloads\\Sample PDF file.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		Thread.sleep(2000);

		// To perform CTRL + V action

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		mipo.EnterComment().sendKeys("PDF File Attached Succesfully... ");
		Thread.sleep(2000);

		// driver.close();
	}

}
