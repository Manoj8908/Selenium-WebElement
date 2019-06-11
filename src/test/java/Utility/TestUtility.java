package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtility {

	public static void ClickOn(WebDriver driver,WebElement element,int timeout)
	{
		
		new WebDriverWait(driver , timeout).
		until(ExpectedConditions.visibilityOf(element));
		element.click();
		
	}
	public static void SendKeys(WebDriver driver,WebElement element,int timeout,String value)
	{
		
		new WebDriverWait(driver , timeout).
		until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(value);
		
	}

}
