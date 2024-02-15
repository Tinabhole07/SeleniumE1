package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollTillParticularElement {

	public static void main(String[] args) {
		WebDriver	driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));// to provide implicitwait
	    driver.get("https://www.selenium.dev/");//to launch webapplication
	    driver.findElement(By.xpath("//h2[text()='News']"));
	    
	    JavascriptExecutor js = driver.findElement(By)
	}

}
