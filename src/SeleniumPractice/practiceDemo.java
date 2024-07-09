package SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement firstColumn = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));
		System.out.println(firstColumn.findElements(By.tagName("a")).size());
		for (int i = 1; i < firstColumn.findElements(By.tagName("a")).size(); i++) {
			String clickOnLinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			firstColumn.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinks);
			Set<String> windows = driver.getWindowHandles();
			driver.switchTo().window("").getTitle();
		}
		driver.quit();
	}

}
