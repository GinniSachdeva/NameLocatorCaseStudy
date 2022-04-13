package chromelocator;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\DXC Selenium Automation Class\\NameLocatorCaseStudy\\ChromeJars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.name("input-email")).sendKeys("XYZ"); 
		driver.findElement(By.name("input-password")).sendKeys("XYZ123");

	}

}
