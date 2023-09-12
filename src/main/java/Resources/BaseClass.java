package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	
	Properties properties;

	public void initializeDriver() throws IOException {

		FileInputStream fis = new FileInputStream(
				"D:\\TechnoGreekProject\\TechnoGreekFrameWork\\src\\main\\java\\Resources\\data.properties");
		 properties = new Properties();
		properties.load(fis);
		String browserName = properties.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("fireFox")) {
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else {

			System.out.println(" Please choose correct browser ...");
		}

	}
	
	@BeforeMethod
	public void LaunchURL() throws IOException {
		
		initializeDriver();
		driver.get(properties.getProperty("url"));
		
		
	}
	
	@AfterMethod
	public void QuiteBrowser() {
		driver.quit();
	}
}
