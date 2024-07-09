package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FirstProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get("https://rahulshettyacademy.com/AutomationPractice/");
		webdriver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(webdriver.findElement(By.id("checkBoxOption1")).isSelected());
		Thread.sleep(2000L);
		webdriver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(webdriver.findElement(By.id("checkBoxOption1")).isSelected());
		// webdriver.manage().window().maximize();
		Thread.sleep(2000L);
		System.out.println(webdriver.findElements(By.xpath("//fieldset/label/input[@type='checkbox']")).size());
		System.out.println("Test Passed");
		webdriver.close();
	}

}
