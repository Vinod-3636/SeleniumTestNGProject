package Resources;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonMethod {

	public static void HandleSoftAssertion(String Actual, String Expected) {

		SoftAssert softAssert = new SoftAssert();

		String Actual_PageText = Actual;
		String Expected_PageText = Expected;

		softAssert.assertEquals(Actual_PageText, Expected_PageText);
		softAssert.assertAll();
	}

	public static void HandleDropDown(List<WebElement> list, String text) throws InterruptedException {

		List<WebElement> All_Material_List = list;
		for (WebElement Material : All_Material_List) {

			if (Material.getText().equalsIgnoreCase(text)) {
				Material.click();
				Thread.sleep(2000);
				break;
			}
		}

	}

	public static void HandleVisibiltyOfElement(Boolean Actual, Boolean Expected) {

		SoftAssert softAssert = new SoftAssert();

		Boolean Actual_ElementVisible = Actual;
		Boolean Expected_ElementVisible = Expected;

		softAssert.assertEquals(Actual_ElementVisible, Expected_ElementVisible);
		softAssert.assertAll();
	}

	public static void waitForElementToVisible(By Xpath, WebDriver driver, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(Xpath));
	}
	
	public static void setText(WebElement element, String input) {
		
		element.sendKeys(input);
	}

}
