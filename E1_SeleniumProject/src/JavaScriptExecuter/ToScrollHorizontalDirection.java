package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollHorizontalDirection {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));// to provide implicitwait
	    driver.get("https://omayo.blogspot.com/");//to launch webapplication
	    
	     JavascriptExecutor js = (JavascriptExecutor)driver;//to typecast from webdriver to javascriptExecutor
        
	     js.executeScript("window.scrollBy(500,0)");
         Thread.sleep(2000);
         
         js.executeScript("window.scrollBy(-150,0)");
         Thread.sleep(2000);
         
         driver.close();

	}

}
