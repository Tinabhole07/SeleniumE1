package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleWebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver = new ChromeDriver();
	    driver.manage().window().maximize();
	   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://www.facebook.com/signup");//to launch webapplication
	    Thread.sleep(2000);
	        
	   WebElement hiddenElemnt = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		   
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("argument[0].value='qspider'",hiddenElemnt)
	}

}
