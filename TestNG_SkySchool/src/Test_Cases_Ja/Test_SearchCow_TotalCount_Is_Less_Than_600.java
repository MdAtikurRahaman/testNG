package Test_Cases_Ja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Base_Properties_Ja.Base;


public class Test_SearchCow_TotalCount_Is_Less_Than_600 extends Base{
	
	@Test
	public void verify_Search_Cow_TotalCount_Is_Less_Than_600() {
		navigateUrl(  myProperties.getProperty("url")   );
		click(By.xpath(  myProperties.getProperty("main_page_garden_link")  ));
		sendkeys(By.xpath(  myProperties.getProperty("main_page_search_box")  ), "cow");
		click(By.xpath(  myProperties.getProperty("main_page_search_button")  ));
		
		String result =  getText(By.xpath( myProperties.getProperty("main_page_total_count")  ));
		Assert.assertTrue(Integer.parseInt(result) < 600);
	}

}
