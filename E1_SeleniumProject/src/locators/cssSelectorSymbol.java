package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorLocator 
{	
		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");
			Thread.sleep(1000);
			
			  WebElement usnTextbox =driver.findElement(By.cssSelector("input[aria-label^='Phone number, username, or email']"));
			  usnTextbox.sendKeys("qspider");
		
			  
			  WebElement passTextbox =driver.findElement(By.cssSelector("input[type$='password']"));
			  passTextbox.sendKeys("password");
			  
			  WebElement loginButton = driver.findElement(By.cssSelector("button[type*='submit']"));
			  loginButton.click();
			  
			
		}

}
