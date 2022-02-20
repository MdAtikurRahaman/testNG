package Craigslist;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Base2;

public class TestCraigslistMaxVerify extends Base2{


	@Test
	void test_Creaiglist_Verify_Max_Box_Is_Visible() {
	
		//public static void main(String[] args) {
		
//		WebDriver browser; 
//		System.setProperty("webdriver.chrome.driver", "C:\\java\\driver\\chromedriver.exe");
//		browser = new ChromeDriver();  
//		browser.manage().window().maximize();
//		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	

		//browser.get("http://craigslist.org");
		navigate("http://craigslist.org");
		
		sendKeys("//input[@id='query']", "car"+ Keys.ENTER);
		
		//browser.findElement(By.xpath("//span[text()='accounting+finance']")).click();
		//click("//span[text()='accounting+finance']");
		
		//Boolean result = browser.findElement(By.linkText("accounting/finance")).isDisplayed();
		boolean result = isDisplayed("//input[@name='max_price']");
//		
//		if (result == true) {
//			System.out.println("accounting/finance link is working fine");
//		}
//		if (result == false) {
//			System.out.println("accounting/finance link is NOT working");
//		}
		
		Assert.assertEquals(result, true);
		
		

	}

}
