package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTripAssignment {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver32.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get("https://www.cleartrip.com/");
		webdriver.manage().window().maximize();
		Select adults = new Select(webdriver.findElement(By.id("Adults")));
		adults.selectByIndex(2);

		Select children = new Select(webdriver.findElement(By.id("Childrens")));
		children.selectByIndex(2);

		webdriver.findElement(By.id("DepartDate")).click();
		webdriver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
		webdriver.findElement(By.id("MoreOptionsLink")).click();
		webdriver.findElement(By.id("AirlineAutocomplete")).sendKeys("kingfisher");
		webdriver.findElement(By.id("SearchBtn")).click();
		System.out.println(webdriver.findElement(By.id("homeErrorMessage")).getText());
	}
}
