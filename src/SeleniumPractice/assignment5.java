package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("checkBoxOption2")).click();
		String variable = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		System.out.println(variable);
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByVisibleText(variable);
		driver.findElement(By.id("name")).sendKeys(variable);
		driver.findElement(By.id("alertbtn")).click();
		String alerttext = driver.switchTo().alert().getText();
		if (variable.contentEquals(alerttext.split(" ")[1].split(",")[0])) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		System.out.print("Assignment 5 branch is updated");
		driver.quit();
	}

}
