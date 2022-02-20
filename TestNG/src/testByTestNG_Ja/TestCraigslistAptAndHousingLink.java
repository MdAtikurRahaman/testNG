package testByTestNG_Ja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCraigslistAptAndHousingLink {
	
	@Test
	public void testCLAptAndHousingLink() {
		WebDriver site; 
		System.setProperty("webdriver.chrome.driver", "C:\\java\\driver\\chromedriver.exe");
		site = new ChromeDriver();  

		site.get("http://craigslist.org");
		
		site.findElement(By.xpath("//span[text()='apts / housing']")).click();
		
		String result = site.findElement(By.linkText("apartments / housing for rent")).getText();
		site.close();
		
		Assert.assertEquals(result, "apartments / housing for rent");
	}

}
