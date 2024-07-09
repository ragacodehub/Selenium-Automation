package SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTabs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		String parent = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		openMultipleTabs(driver, parent);
	}

	@Test
	public static void openMultipleTabs(WebDriver driver, String parent) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.open('https://naukri.com','_blank')");
		Thread.sleep(5000);
		Set<String> allwindowhandles = driver.getWindowHandles();
		System.out.println(allwindowhandles);
		System.out.println(allwindowhandles.size());
		for (String currentwindowhandle : allwindowhandles) {
			if (!currentwindowhandle.equalsIgnoreCase(parent)) {
				driver.switchTo().window(currentwindowhandle);
				System.out.println(driver.getTitle());
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(parent).close();
	}
}
