package JavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptDemo { 
	
	
	public static void scrollelement(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		
	}
	
	public static void scrollelementtoend(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)",element);
		
	}
	
	public static void flash(WebElement element,WebDriver driver) {
		
	String bgcolor = element.getCssValue("backgroundcolor");
		
		for(int i =0;i<500;i++) {
			
			changecolor("#000000",element,driver);
			changecolor(bgcolor,element,driver);
		}
		
	}
	public static void changecolor(String color,WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundcolor = '" + color + "'",element);
		
		try {
			Thread.sleep(30);
		}catch(InterruptedException e ) {
			
		}
		
	}
	public static void drawboarder(WebElement element,WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
			}
	public static String gettitlebyjs(WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String TitleName = js.executeScript("return document.title;").toString();
		return TitleName;
	}
	
	public static void clickelementbyjs(WebElement element,WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("argument[0].click();", element);
	}
	
	public static void Generatealertbyjs(WebDriver driver,String message) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('" + message + "')");
		}
	
	public static void refreshbyjs(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
}
