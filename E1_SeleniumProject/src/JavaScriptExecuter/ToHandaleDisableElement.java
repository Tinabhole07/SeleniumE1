package JavaScriptExecuter;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandaleDisableElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));// to provide implicitwait
	    driver.get("https://demoapps.qspiders.com/ui?scenario=1");//to launch webapplication
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//li[text()='Disabled']")).click();
	    Thread.sleep(2000);
	    
	   WebElement disableTextBox = driver.findElement(By.id("name"));
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;//to Typecast into javascript  
	    js.executeScript("document.getElementById('name').value='admin'");
	    Thread.sleep(3000);

	    //js.executeScript("document.getElementById('name').value=''");
	                                       //to clear the content from a disable textbox
	    //Thread.sleep(5000);
	    js.executeScript("argument[0].value=''",disableTextBox);
	    
	    driver.close();

	}

}
