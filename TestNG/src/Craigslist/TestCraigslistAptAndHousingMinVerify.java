package Craigslist;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Base2;

public class TestCraigslistAptAndHousingMinVerify extends Base2{
	
	@Test
	public void test_Creaiglist_Verify_Min_Box_Is_Visible() {
//		WebDriver browser; 
//		System.setProperty("webdriver.chrome.driver", "C:\\java\\driver\\chromedriver.exe");
//		browser = new ChromeDriver();  

		//browser.get("http://craigslist.org");
		navigate("http://craigslist.org");
		
		sendKeys("//input[@id='query']", "apts/housing"+ Keys.ENTER);
		
		//click();
		
		//browser.findElement(By.xpath("//span[text()='apts / housing']")).click();
		
//		String result = browser.findElement(By.linkText("apartments / housing for rent")).getText();
//		browser.close();
		
		boolean result = isDisplayed("//input[@name='min_price']");
		
		Assert.assertEquals(result, true);
	}

}
