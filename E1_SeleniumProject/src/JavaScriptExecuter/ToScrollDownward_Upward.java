package JavaScriptExecuter;

import java.io.Closeable;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollDownward_Upward {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));// to provide implicitwait
	    driver.get("https://www.selenium.dev/");//to launch webapplication
	    
	     JavascriptExecutor js = (JavascriptExecutor)driver;//to typecast from webdriver to javascriptExecutor
	     js.executeScript("window.scrollBy(0,500)");
	     Thread.sleep(2000);
	     js.executeScript("window.scrollBy(0,-300)");
	     driver.close();5

	}

}
