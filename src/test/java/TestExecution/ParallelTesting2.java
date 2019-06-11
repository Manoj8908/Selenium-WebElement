package TestExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTesting2 {
	
  @Test
  public void f() throws InterruptedException {
	  
	System.out.println("hi I am one");
		
  }
  @Test
  	public void f1() throws InterruptedException {
	  System.out.println("hi i am two");
	  
  }
  @Test
  		public void f2() throws InterruptedException {
	  System.out.println("hi i am tthree");
	
}
  }
