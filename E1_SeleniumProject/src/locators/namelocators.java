package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class namelocators {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		WebElement usnTB = driver.findElement(By.name("email"));
		usnTB.sendKeys("email");
		
		
		WebElement passTextbox = driver.findElement(By.id("pass"));
		passTextbox.sendKeys("Password");

		
		WebElement loginButton = driver.findElement(By.name("login")
		loginButton.click();
	}
}
		