package Test_Cases_Ja;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base_Properties_Ja.Base;


public class Test_SrarchCar_TotalCount_is_greater_than_1000 extends Base {
	
	@Test
	public void verify_SrarchCar_TotalCount_is_greater_than_1000() {
		navigateUrl(  myProperties.getProperty("url")   ); //54:30
		click(By.xpath(  myProperties.getProperty("main_page_car_trucks_link")  ));
		sendkeys(By.xpath(  myProperties.getProperty("main_page_search_box")  ), "car");
		click(By.xpath(  myProperties.getProperty("main_page_search_button")  ));
		
		String result =  getText(By.xpath( myProperties.getProperty("main_page_total_count")  ));
		Assert.assertTrue(Integer.parseInt(result) > 1000);
		
	}
	 
	
	
}
