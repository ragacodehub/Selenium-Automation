package SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		WebElement newtab = driver.findElement(By.id("tabButton"));
		String parent = driver.getWindowHandle();
		for (int i = 0; i < 3; i++) {
			newtab.click();
			Thread.sleep(3000);
		}
		Set<String> allwindowhandles = driver.getWindowHandles();
		for (String currenthandle : allwindowhandles) {
			driver.switchTo().window(currenthandle);
			Thread.sleep(3000);
		}
		driver.switchTo().window(parent);
		driver.close();
	}
}
