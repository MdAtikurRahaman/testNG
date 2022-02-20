package testByTestNG_Ja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCraigslistAccountingAndFinanaceLink {
	
	@Test  
	public void testCLAccountingAndFinanace() {
		WebDriver site; 
		System.setProperty("webdriver.chrome.driver", "C:\\java\\driver\\chromedriver.exe");
		site = new ChromeDriver();  

		site.get("http://craigslist.org");
		
		site.findElement(By.xpath("//span[text()='accounting+finance']")).click();
		
		String result = site.findElement(By.linkText("accounting/finance")).getText();
		site.close();
		
		Assert.assertEquals(result, "accounting/finance");  //if both same then pass
		
	}


}//class
