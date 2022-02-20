package Properties_File_Ja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifySearchWithSeeds{
	
	@Test
	public void verifyTotlaCountisLessTahn100() {
		
		System.setProperty("webdriver.chrome.driver","C:\\java\\driver\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://craigslist.org");
		
		driver.findElement(By.xpath("//a[@class='gra']/span[text()='farm+garden']")).click();
		
		driver.findElement(By.xpath("//input[@id='query']")).sendKeys("seeds");
		
		driver.findElement(By.xpath("//div[@class='querybox']/button[@type='submit']")).click();
		
		String result = driver.findElement(By.xpath("//div[@class='search-legend']/div/span/span/span[@class='totalcount']")).getText();
		
		//Verify total count is less than 100
		Assert.assertTrue(Integer.parseInt(result) < 100);
		
		driver.close();
		
		//Q: How do you convert String to integer, String to double,    Any Value to String?
		//  Integer.parseInt("234"),  Double.parseDouble("3.5") ,            .toString()

	}

}
