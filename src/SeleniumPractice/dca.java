package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dca {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver_107.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@value='radio1']")).click();

		Select se = new Select(driver.findElement(By.id("dropdown-class-example")));
		se.selectByIndex(0);
		se.selectByValue("option2");
		se.selectByVisibleText("Option3");
		// se.deselectByValue("option3");
		// se.deselectAll();

		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(checkbox));
		checkbox.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkBoxOption2")));
		WebElement c2 = driver.findElement(By.id("checkBoxOption2"));
		c2.click();
		System.out.println(c2.getRect().getX());

		driver.findElement(By.id("name")).sendKeys("Alerts");
		driver.findElement(By.id("alertbtn")).click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		WebElement textBox = driver.findElement(By.id("name"));
		textBox.clear();
		Actions act3 = new Actions(driver);
		act3.moveToElement(textBox).click();
		act3.keyDown(Keys.SHIFT);
		act3.sendKeys("h");
		act3.sendKeys(" bday");
		act3.keyUp(Keys.SHIFT);
		act3.build().perform();
		Thread.sleep(3000);
		driver.findElement(By.id("confirmbtn")).click();
		Alert alt2 = driver.switchTo().alert();
		alt2.dismiss();

		driver.findElement(By.id("openwindow")).click();
		String parent = driver.getWindowHandle();
		Set<String> list = driver.getWindowHandles();
		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			String child = it.next();
			if (!(parent.equalsIgnoreCase(child))) {
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				driver.switchTo().window(parent);
				System.out.println(driver.getTitle());
			}
		}
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='courses-iframe']")));
		driver.findElement(By.linkText("Mentorship")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("mousehover"))).perform();
		act.moveToElement(driver.findElement(By.cssSelector("div[class=\"mouse-hover-content\"] a"))).perform();
	}
}
