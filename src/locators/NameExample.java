package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class NameExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver",
				"C:\\DXC Selenium Automation Class\\NameLocatorCaseStudy\\FirefoxJars\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.name("input-email")).sendKeys("XYZ"); 
		driver.findElement(By.name("input-password")).sendKeys("XYZ123");
	}

}
