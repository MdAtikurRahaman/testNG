package Others;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Base;

public class TestCraigslistAccountingAndFinanaceLinkJanu extends Base{
	
	@Test  
	public void testCLAccountingAndFinanace() {
		WebDriver browser; 
		System.setProperty("webdriver.chrome.driver", "C:\\java\\driver\\chromedriver.exe");
		browser = new ChromeDriver();  

		browser.get("http://craigslist.org");
		
		browser.findElement(By.xpath("//span[text()='accounting+finance']")).click();
		
		String result = browser.findElement(By.linkText("accounting/finance")).getText();
		browser.close();
		
		Assert.assertEquals(result, "accounting/finance");  //if both same then pass
		
	}


}//class
