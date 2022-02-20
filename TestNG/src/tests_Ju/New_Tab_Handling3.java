package tests_Ju;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Base;

public class New_Tab_Handling3 extends Base {
	@Test
	void Test_SkySchooloing_8Locators() throws InterruptedException {
		/*
		skySchooling_LogIn();
		
		click(By.xpath("//a[text()='all 8 locators HTML file']"));
		
		browser.navigate().to("https://test.skyschooling.com/8-locator-of-selenium/");
//		browser.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//UserName
		sendKeys(By.name("username"), "SDET_jahed");
		//First Name
		sendKeys(By.id("first_name"), "MOHIUDDIN");
		//Last Name
		
		//Address
		sendKeys(By.xpath("//input[@id='address_1']"), "CHITTAGONG");
		
		//Check Box : Click
//		click(By.xpath("//input[@type='checkbox']"));
		
		browser.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		String Landing_Window_ID=browser.getWindowHandle();
		System.out.println("Landing Window Id is : "+ Landing_Window_ID);
		click(By.linkText("Click Here"));
		
		Set<String> New_Window_ID=browser.getWindowHandles();
		for (String w_Handle : New_Window_ID) {
			System.out.println(w_Handle);
			if (!w_Handle.equals(Landing_Window_ID)) {
//				browser.close();
				browser.switchTo().window(w_Handle);
				System.out.println("No Element to locate");
				browser.close();
			}
			*/
		/*
		}//for
		browser.switchTo().window(Landing_Window_ID);
		WebElement checkBox=browser.findElement(By.xpath("//li[@id='wppb-form-element-9']/input[@value='Privacy & Policy']"));
		
		//Scroll page OPTIONAL WORK
		JavascriptExecutor j=(JavascriptExecutor) browser;
		j.executeScript("arguments[0].scrollIntoView();",checkBox);
		Thread.sleep(2000);

//		WebElement checkBox=browser.findElement(By.xpath("//li[@id='wppb-form-element-9']/input[@value='Privacy & Policy']"));
		checkBox.click();
		*/
	}//class

}
