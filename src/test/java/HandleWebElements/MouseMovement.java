package HandleWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMovement {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector(".menulink"))).build().perform();
		
		driver.close();
	}

}
