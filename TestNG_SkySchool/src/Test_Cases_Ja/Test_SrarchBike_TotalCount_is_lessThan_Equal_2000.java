package Test_Cases_Ja;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base_Properties_Ja.Base;



public class Test_SrarchBike_TotalCount_is_lessThan_Equal_2000 extends Base {
	@Test
	public void verify_SrarchBike_TotalCount_is_greater_than_1000() {
		navigateUrl(  myProperties.getProperty("url")   ); //54:30
		click(By.xpath(  myProperties.getProperty("main_page_bikes_link")  ));
		sendkeys(By.xpath(  myProperties.getProperty("main_page_search_box")  ), "bike");
		click(By.xpath(  myProperties.getProperty("main_page_search_button")  ));
		
		String result =  getText(By.xpath( myProperties.getProperty("main_page_total_count")  ));
		Assert.assertTrue(Integer.parseInt(result) <= 2000);
	}
}
