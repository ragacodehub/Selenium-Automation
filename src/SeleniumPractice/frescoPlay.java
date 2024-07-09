package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frescoPlay {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:ww12.demoaut.com/");

		WebDriverWait wait = new WebDriverWait(driver, 3000);
		WebElement iframe = driver.findElement(By.id("master-1"));
		wait.until(ExpectedConditions.visibilityOf(iframe));
		driver.switchTo().frame(iframe);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='e3']")));
		driver.findElement(By.xpath("//div[@id='e3']")).click();
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='e1']/div[3]/div/div/a")));
		// driver.findElement(By.xpath("//div[@id='e1']/div[3]/div/div/a")).click();
		String url = driver.findElement(By.xpath("//*[@id=\"e1\"]/div[3]/div/div/a")).getAttribute("href");
		driver.get(url);
		/*
		 * Set<String> ids = driver.getWindowHandles(); Iterator<String> it =
		 * ids.iterator(); String Parentid = it.next(); String Childid = it.next();
		 * driver.switchTo().window(Childid);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//div[@class='bui-group bui-button-group bui-group--inline bui-group--align-end bui-group--vertical-align-middle']/div[5]/a/span']"
		 * ))); driver.findElement(By.xpath(
		 * "//div[@class='bui-group bui-button-group bui-group--inline bui-group--align-end bui-group--vertical-align-middle']/div[5]/a/span']"
		 * )) .click();
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		 * driver.findElement(By.id("username")).sendKeys("helloall");
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(
		 * By.xpath("//button[@class='bui-button bui-button--large bui-button--wide']"))
		 * ); driver.findElement(By.
		 * xpath("//button[@class='bui-button bui-button--large bui-button--wide']")).
		 * click();
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("new_password"
		 * ))); driver.findElement(By.id("new_password")).sendKeys("helloall123");
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
		 * "confirmed_password")));
		 * driver.findElement(By.id("confirmed_password")).sendKeys("helloall123");
		 * driver.findElement(By.
		 * xpath("//button[@class='bui-button bui-button--large bui-button--wide']")).
		 * click(); driver.quit();
		 */
	}
}
