package Resources;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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

	

}
