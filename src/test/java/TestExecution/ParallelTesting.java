package TestExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting {
	static WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\Sel jar\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Facebook");
		Thread.sleep(2000);
		driver.close();
		
  }
  	@Test
  	public void f1() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\Sel jar\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Facebook123");
		Thread.sleep(2000);
		driver.close();
  }
  		@Test
  		public void f2() throws InterruptedException {
  			 System.setProperty("webdriver.chrome.driver", "E:\\Sel jar\\Drivers\\chromedriver.exe");
  			driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Facebook253");
		Thread.sleep(2000);
		driver.close();
}
  }
