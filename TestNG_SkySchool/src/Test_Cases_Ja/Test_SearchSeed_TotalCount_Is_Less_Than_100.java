package Test_Cases_Ja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Base_Properties_Ja.Base;



public class Test_SearchSeed_TotalCount_Is_Less_Than_100 extends Base{
	
	@Test
	public void verify_Seeed_Search_TotalCount_Is_Less_Than_100() {
		navigateUrl(  myProperties.getProperty("url")   );
		click(By.xpath(  myProperties.getProperty("main_page_garden_link")   ));
		//click(By.xpath("//a[@class='gra']/span[text()='farm+garden']"));
		
		sendkeys(By.xpath(  myProperties.getProperty("main_page_search_box")  ), "seeds");
		//sendkeys(By.xpath("//input[@id='query']"), "seeds");
		
		
		click(By.xpath( myProperties.getProperty("main_page_search_button") ));
		String result =  getText(By.xpath( myProperties.getProperty("main_page_total_count") ));
		Assert.assertTrue(Integer.parseInt(result) < 100);
		
	}

}
