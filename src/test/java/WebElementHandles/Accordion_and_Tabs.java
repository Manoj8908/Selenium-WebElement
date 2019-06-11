 package WebElementHandles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Accordion_and_Tabs {
	
	static WebDriver driver; 
	
	@Test 
	public void ValidateAccordian_Tabs() throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		driver.get("http://www.globalsqa.com/demo-site/");
		driver.findElement(By.xpath("//*[@id=\"post-2715\"]/div[2]/div/div/div[2]/div[1]/ul/li[2]/a")).click();
		
		List<WebElement> Allframe = driver.findElements(By.tagName("iframe"));
		System.out.println(Allframe.size());
		
		driver.switchTo().frame("demo-frame");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]")).click();
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
