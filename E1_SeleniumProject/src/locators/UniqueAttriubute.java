package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniqueAttriubute {

	public static void main(String[] args) throws InterruptedException 
	{
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("https://app.fireflink.com/signin");
	 Thread.sleep(1000);
	 
	 //WebElement signLink = driver.findElement(By.partialLinkText("Sign In"));
	 //signLink.click();
	 //Thread.sleep(1000);

	 WebElement email = driver.findElement(By.xpath("//input[@name='emailId']"));
	 email.sendKeys("bholetina07@gmail.com");
	 Thread.sleep(1000);
	 
	 WebElement password = driver.findElement(By.xpath("//input[@id='mui-2']"));
	 password.sendKeys("Password@1234");
	 Thread.sleep(1000);
	 
	 WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
	 button.click();
	 

	}

}
