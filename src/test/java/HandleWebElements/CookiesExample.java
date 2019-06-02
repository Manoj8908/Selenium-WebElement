package HandleWebElements;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesExample {
	
	WebDriver driver;
	
	@Test 
	public void cooky() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		Set <Cookie> cookies = driver.manage().getCookies();
		
		System.out.println("The Size of Cookies: "+cookies.size());
		
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+":"+cookie.getValue());
		}
		
		System.out.println(driver.manage().getCookieNamed("session-id-time"));
		
		//Creating the Cookie or add the Cookie
		
		Cookie cobj = new Cookie("My _Cookie_234","8908354624");
		
		driver.manage().addCookie(cobj);
		
        cookies = driver.manage().getCookies();
		
		System.out.println("The Size of Cookies: "+cookies.size());
		
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+":"+cookie.getValue());
		}
		//Delete the specific Cookie
		driver.manage().deleteCookie(cobj);
		cookies = driver.manage().getCookies();
		
		System.out.println("The Size of Cookies: "+cookies.size());
		
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getName()+":"+cookie.getValue());
		}
		driver.manage().deleteAllCookies();
        cookies = driver.manage().getCookies();
		
		System.out.println("The Size of Cookies: "+cookies.size());
		
		driver.close();
	}

}
