package HandleWebElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	
	WebDriver driver;
	
	@Test
	public void VdropDown() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement Ele = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select ddown = new Select(Ele);
		
		//String z = ddown.getFirstSelectedOption().getAttribute("value");
		//System.out.println(z);
		
		List<WebElement> dlist = ddown.getOptions();
		/*for(int i =0;i<=dlist.size()-1;i++) {
			System.out.println(dlist.get(i).getText());
		}*/
		
		List OriginalList = new ArrayList();
		
		List templist = new ArrayList();
		
		//Comparision the dropdown
		
		for(WebElement we:dlist) {
			OriginalList.add(we.getText());
			templist.add(we.getText());
			}
		System.out.println("Before Sorting Original List is : "+OriginalList);
		
		System.out.println("Before Sorting the Templist:"+templist);
		
		Collections.sort(templist);
		
		System.out.println("After Sorting Original List is : "+OriginalList);
		
		System.out.println("After sort the Templist:"+templist);
		
		if(OriginalList == templist) {
			
			System.out.println("DropDown Sorted");
		}
		else {
			System.out.println("Dropdown not sorted");
		}
		
		driver.close();
	}

}
