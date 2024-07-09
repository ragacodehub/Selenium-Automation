package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver105.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		WebElement tabledriver = driver.findElement(By.xpath("//table[@name='courses']/tbody"));
		int rowscount = tabledriver.findElements(By.tagName("tr")).size();
		System.out.println(rowscount);
		WebElement columndriver = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[1]"));
		int columncount = columndriver.findElements(By.tagName("th")).size();
		System.out.println(columncount);
		List<WebElement> secondRowData = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[3]/td"));
		for (WebElement element : secondRowData) {
			System.out.println(element.getText());
			Thread.sleep(3000);
		}
		driver.quit();
	}

}
