package TestExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	
	WebDriver driver;
	@Test
	@Parameters("Browser")
	public void verifytitle(String BrowserName ) throws InterruptedException {
	
	if(BrowserName.equalsIgnoreCase("Firefox")) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	else if(BrowserName.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "E:\\Sel jar\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(BrowserName.equalsIgnoreCase("IE"))
	{
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	String Title = driver.getTitle();
	System.out.println(Title);
	
	Thread.sleep(2000);
	driver.quit();

}
}
